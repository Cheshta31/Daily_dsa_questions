question link-->>>https://leetcode.com/problems/rotate-string/submissions/
////////////////////////////////////SOLUTION/////////////////////////////////////////////////////////
class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        if (s.equals(goal)) return true;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < s.length(); i++) {
            sb.append(s.substring(1)).append(s.charAt(0));
            s = sb.toString();
            if (s.equals(goal)) return true;
            sb.setLength(0);
        }
        return false;
    }
}
