package RegularExpressionMatch;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isMatch(String s, String p) {
        Map<String, Boolean> cache = new HashMap<>();
        return dp(s, p, 0, 0, cache);
    }

    public boolean dp(String s, String p, int i, int j, Map<String, Boolean> cache) {
        String key = i + "," + j;
        if (cache.containsKey(key)) {
            return cache.get(key);
        }
         if (i >= s.length() && j >= p.length()) {
            return true;
        }

        if (j >= p.length()) {
            return false;
        }

        boolean match = i < s.length() && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.');

        if ((j + 1) < p.length() && p.charAt(j + 1) == '*') {
            cache.put(key, (dp(s, p, i, j + 2, cache) || (match && dp(s, p, i + 1, j, cache))));
            return cache.get(key);
        }
        if (match) {
            cache.put(key, dp(s, p, i + 1, j + 1, cache));
            return cache.get(key);
        }

        cache.put(key, false);
        return false;
    }
}