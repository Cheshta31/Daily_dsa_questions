https://leetcode.com/problems/valid-palindrome/description/
class Solution {
    public boolean isPalindrome(String s) {
        String s1="";
        for(int i=0;i<s.length();i++){
            if((int)s.charAt(i)>=65 && (int)s.charAt(i)<=90 ){
                         s1+=s.charAt(i);
                        s1=s1.toLowerCase();
                        }
                        else if((int)s.charAt(i)>=97 && (int)s.charAt(i)<=122){
                            s1+=s.charAt(i);
                            
                        }
                        else if((int)s.charAt(i)>=48 && (int)s.charAt(i)<=57){
                            s1+=s.charAt(i);
                        }
        }
           StringBuilder input1 = new StringBuilder();
            input1.append(s1);
            input1.reverse();
            if(input1.toString().equals(s1)){
                return true;
            }

return false;
    }
}
