https://leetcode.com/problems/to-lower-case/description/

class Solution {
    public String toLowerCase(String s) {
        String ans="";char ch=' ';int j=-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=65 && s.charAt(i)<=90){
                j=(int)s.charAt(i)+32;
                ch=(char)j;
                ans+=ch;
            }
            else{
                ans+=s.charAt(i);
            }
        }
        return ans;
    }
}
