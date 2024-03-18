public class Solution {
    public long countSubstrings(String s, char c) {
        long count = 0;
        for (char ch : s.toCharArray()) { // Iterate through each character
            if (ch == c) {
                count++;
            }
        }

        // Calculate combinations using the formula for unordered pairs
        return count * (count - 1) / 2 + count; // Add single-character substrings
    }
}
