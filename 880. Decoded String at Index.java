https://leetcode.com/problems/decoded-string-at-index/description/?envType=daily-question&envId=2023-09-27
class Solution {
    public String decodeAtIndex(String s, int k) {

  long size=0;
  for(int i=0;i<s.length();i++){
      if(Character.isDigit(s.charAt(i))){
          size*=s.charAt(i)-'0';
      }
      else{
          size++;
      }
  }
for(int i=s.length()-1;i>=0;i--){
    k=(int)(k%size);
    if(k==0 && Character.isLetter(s.charAt(i))){
        return String.valueOf(s.charAt(i));
    }

if(Character.isDigit(s.charAt(i))){
    size/=s.charAt(i)-'0';
}
else{
    size--;
}
}
return "";
    }
}
