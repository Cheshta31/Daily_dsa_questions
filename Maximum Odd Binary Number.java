https://leetcode.com/problems/maximum-odd-binary-number/description/

class Solution {
    public String maximumOddBinaryNumber(String s) {
        
int digit_count=s.length();
int one_count=0;
for(int i=0;i<s.length();i++){
    if(s.charAt(i)=='1'){
        one_count++;
    }
}
String s1=" ";
one_count=one_count-1;
for(int i=0;i<s.length()-1;i++){
    if(one_count>0){
    s1=s1.concat("1");
    one_count--;
    }
    else{
        s1=s1.concat("0");
    }
}
s1+="1";
return s1.trim();


    }
}
