quetion link-->>https://leetcode.com/problems/number-of-lines-to-write-string/editorial/

class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int tempSum = 0, lineCounter = 1;
        for (char c : s.toCharArray()) {
            int currCharLen = widths[c - 'a'];
            if (tempSum + currCharLen <= 100) {
                tempSum += currCharLen;
            } else {
                lineCounter++;
                tempSum = currCharLen;
            }
        }
        return new int[]{lineCounter, tempSum};
    }
}
