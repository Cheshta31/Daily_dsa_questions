https://leetcode.com/problems/repeated-substring-pattern/description/
class Solution {
    public boolean repeatedSubstringPattern(String s) {
      String  s1=s+s;
        String sub=s1.substring(1,s1.length()-1);
            if(sub.contains(s)){
                return true;
            }
        return false;    
    }
}
