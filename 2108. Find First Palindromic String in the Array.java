https://leetcode.com/problems/find-first-palindromic-string-in-the-array/description/
class Solution {
    public String firstPalindrome(String[] words) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<words.length;i++){
                sb.append(words[i]);
                sb.reverse();
                if(sb.toString().equals(words[i])){
                    return words[i];

                }
else{
    sb.setLength(0);
}
        }
return sb.toString();
    }
}
