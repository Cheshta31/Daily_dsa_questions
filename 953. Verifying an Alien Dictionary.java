questionlink-->>https://leetcode.com/problems/verifying-an-alien-dictionary/description/

class Solution {
    public boolean isAlienSorted(String[] words, String order) {
      for (int i = 1; i < words.length; i++)
            if (compare(words[i - 1], words[i], order) > 0) return false;
        return true;
    }

    private int compare(String s, String t, String order) {
        int m = s.length(), n = t.length();
        for (int i = 0; i < m && i < n; i++) {
            int cmp = order.indexOf(s.charAt(i)) - order.indexOf(t.charAt(i));
            if (cmp != 0) return cmp;
        }
        return m - n;
    }
}
