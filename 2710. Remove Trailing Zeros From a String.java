
class Solution {
    public String removeTrailingZeros(String num) {
        int k=num.length()-1;
        int i=0;
        for(i=k;i>=0;i--){
            if(num.charAt(i)!='0'){
                        break;
            }
        }
        return num.substring(0,i+1);
    }
}
