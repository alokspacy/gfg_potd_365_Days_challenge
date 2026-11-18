// XOR of Number Range

class Solution {
    public int findXOR(int l, int r) {
        return xor(r) ^ xor(l - 1);
    }

    private int xor(int n) {
        if (n % 4 == 0) {
            return n;
        } else if (n % 4 == 1) {
            return 1;
        } else if (n % 4 == 2) {
            return n + 1;
        } else {
            return 0;
        }
    }
}
