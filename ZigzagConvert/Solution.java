package ZigzagConvert;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        int id = 0, n = 1;
        // Create an array of lists to store characters for each row
        List<List<Character>> rows = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            rows.add(new ArrayList<>());
        }

        for (char c : s.toCharArray()) {
            rows.get(id).add(c); // Adds the character to the correct row
            if (id == 0) {
                n = 1; // Change direction to down
            } else if (id == numRows - 1) {
                n = -1; // Change direction to up
            }
            id += n; // Move to the next row in the current direction
        }

        StringBuilder result = new StringBuilder();
        for (List<Character> row : rows) {
            for (char c : row) {
                result.append(c);
            }
        }

        return result.toString();
    }
}