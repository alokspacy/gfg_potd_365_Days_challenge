// Repeated Pattern Check

class Solution {
    public boolean findPattern(String s) {
        // code here
        int x = 0;
        int y = 0;

        for (char c : s.toCharArray()) {
            if (y > x) {
                return false;
            }
            if (c == 'x') {
                x++;
            }
            if (c == 'y') {
                y++;
            }
            if (x > 0 && x == y) {
                x = 0;
                y = 0;
            }
        }

        return x == 0 && y == 0;
    }
}
