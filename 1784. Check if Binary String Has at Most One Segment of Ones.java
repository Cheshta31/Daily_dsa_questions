https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/description/

class Solution {
    public boolean checkOnesSegment(String s) {
         return !s.contains("01");
    }
}
