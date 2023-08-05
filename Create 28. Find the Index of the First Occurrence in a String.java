question  link-->https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
class Solution {
    public int strStr(String h, String n) {
        int k=0;
        for(int i=0;i<=h.length()-n.length();i++){
               
                String s=h.substring(i,i+n.length());
              if(s.equals(n)){
                  return i;
              }

        }
return -1;

        
    }
}
