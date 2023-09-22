https://leetcode.com/problems/reformat-the-string/description/
class Solution {
    public String reformat(String s) {
        StringBuilder alpha = new StringBuilder();
        StringBuilder digit = new StringBuilder();
        
        
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(ch >= '0' && ch <= '9'){
                digit.append(ch);
            }else{
                alpha.append(ch);
            }
        }
        
        if(Math.abs(digit.length() - alpha.length()) > 1)return "";
        
        StringBuilder ans = new StringBuilder();
        
        boolean flag = digit.length() >= alpha.length() ? true : false;
        
        int j = 0 , k = 0;
        
        for(int i = 0 ; i < s.length() ; i++){
            if(flag){
                ans.append(digit.charAt(j));
                j++;
            }else{
                ans.append(alpha.charAt(k));
                k++;
            }
            
            flag = !flag;
        }
        
        return ans.toString();
    }
}
