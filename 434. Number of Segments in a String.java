questionlink-->>https://leetcode.com/problems/number-of-segments-in-a-string/description/

class Solution {
    public int countSegments(String s) {
        int space_count=1;
        s=s.trim();
          for(int i=1;i<s.length();i++){
              if(s.charAt(i)==' ' && s.charAt(i-1)!=' '){
                  space_count++;
              }

          }

if(s.length()==0){
    return 0;
}
if(space_count==1 && s.charAt(s.length()-1)==' ')
return 0 ;
else
return space_count;
    }
}
