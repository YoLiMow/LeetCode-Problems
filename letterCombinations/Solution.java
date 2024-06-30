package letterCombinations;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return new ArrayList<>();
        }

        String[] phone = {
            "",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
        };
        List<String> result = new ArrayList<>();
        result.add("");

        for (char i : digits.toCharArray()) {
            List<String> new_result = new ArrayList<>();
            String letters = phone[i - '0'];

            for (String j : result) {
                for (char letter : letters.toCharArray()) {
                    new_result.add(j + letter);
                }
            }
            result = new_result;
        }

        return result;
    }
}