https://leetcode.com/problems/find-the-difference/submissions/

class Solution {
    public char findTheDifference(String s, String t) {
        int randomLetter=0;
        for(char c:s.toCharArray())
            randomLetter-=c;
        for(char c:t.toCharArray())
            randomLetter+=c;
        return (char) randomLetter;
    }
}
