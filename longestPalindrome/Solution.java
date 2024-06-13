package longestPalindrome;

public class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        boolean[][] bool = new boolean[n][n];
        int[] ans = new int[] {0, 0};

        for (int i = 0; i < n; i++) {
            bool[i][i] = true;
        }

        for (int i = 0; i < n - 1; i++) {
            if(s.charAt(i) == s.charAt(i + 1)) {
                bool[i][i + 1] = true;
                ans[0] = i;
                ans[1] = i + 1;
            }
        }

        for (int diff = 2; diff < n; diff++) {
            for (int i = 0; i < n - diff; i++) {
                int j = i + diff;
                if (s.charAt(i) == s.charAt(j) && bool[i + 1][j - 1]) {
                    bool[i][j] = true;
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }

        int i = ans[0];
        int j = ans[1];
        return s.substring(i, j + 1);
    }
}