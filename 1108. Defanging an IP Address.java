https://leetcode.com/problems/defanging-an-ip-address/description/
class Solution {
    public String defangIPaddr(String address) {
        String s="";
        if(address.length()==0){
            return "";
        }
      for(int i=0;i<address.length();i++){
            if(address.charAt(i)=='.'){
                s=s.concat("[.]");
            }
            else{
                s=s.concat(String.valueOf(address.charAt(i)));
            }


      }
return s;
    }
}
