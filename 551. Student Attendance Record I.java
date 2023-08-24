class Solution {
    public boolean checkRecord(String s) {
        int abcount=0,latecount=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='A'){
                abcount++;
            }
            if(ch=='L'){
                latecount++;
            }
                else{
                    latecount=0;
                }
                if(latecount>=3 || abcount>=2){
                    return false;
                }

        }
        return true;
    }
}
