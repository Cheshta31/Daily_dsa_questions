https://leetcode.com/problems/capitalize-the-title/description/

class Solution {
    public String capitalizeTitle(String title) {
        String ans="";int j=0;String s="";
        title=title.concat(" ");
        for(int i=0;i<title.length();i++){
            char ch=title.charAt(i);
            if(ch==' '){
                s=title.substring(j,i);
                j=i+1;

if(s.length()>=3){
    String s1=String.valueOf(s.charAt(0));
   s1= s1.toUpperCase();
   String s2=s.substring(1);
   s2=s2.toLowerCase();
ans=ans.concat(s1.concat(s2));
ans+=" ";
    
}
else{
    
    s=s.toLowerCase();
    ans+=s;
    ans+=" ";
}

            }
        }
        return ans.trim();
    }
}
