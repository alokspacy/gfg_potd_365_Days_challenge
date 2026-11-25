// Geek's Destination with Special Jump

class Solution {
    private static final long MOD = 1_000_000_007L;

    public int minTime(int a, int b, int d, int l, int r) {
        long L = d - r;
        long R = d - l;
        long c = a - b;

        // Part 1: sum of (x + 1) for x in [L, R]
        long count = R - L + 1;
        long sumBase = (count * (L + R + 2) / 2) % MOD;

        // Part 2: 2 * b * sum of ceil((x - a) / c) for x in [max(L, a + 1), R]
        long sumCycles = 0;
        if (R > a) {
            long u1 = Math.max(L, (long) a + 1) - a;
            long u2 = R - a;
            long kSum = prefixCeilSum(u2, c) - prefixCeilSum(u1 - 1, c);
            sumCycles = ((2L * b) % MOD * (kSum % MOD)) % MOD;
        }

        return (int) ((sumBase + sumCycles) % MOD);
    }

    // Returns sum_{u=1}^{m} ceil(u / c)
    private long prefixCeilSum(long m, long c) {
        if (m <= 0) return 0;
        long q = m / c;
        long rem = m % c;
        return c * (q * (q + 1) / 2) + rem * (q + 1);
    }
}
