questionlink-->>https://leetcode.com/problems/check-if-the-number-is-fascinating/description/

class Solution {
    public boolean isFascinating(int n) {
       int two_multi=n*2;
       int three_multi=n*3; 
         String n2m=Integer.toString(two_multi);
           String n3m=Integer.toString(three_multi);
       String n1=Integer.toString(n);
        n1=n1+n2m;
        n1=n1+n3m;
       if(n1.length()!=9){
           return false;
       }
      // n=Integer.parseInt(n1);
        HashSet<Character> s=new HashSet<Character>();
        for(int i=0;i<n1.length();i++){
            if(n1.charAt(i)=='0'){
                return false;
            }
            s.add(n1.charAt(i));

        }
  
       if(s.size()==9){
           return true;
       }
       return false;
    }
}
