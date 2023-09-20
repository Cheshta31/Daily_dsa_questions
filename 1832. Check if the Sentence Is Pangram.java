https://leetcode.com/problems/check-if-the-sentence-is-pangram/

class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean bl[]=new boolean[26];
          Arrays.fill(bl, false);
        for(int i=0;i<sentence.length();i++){
            bl[sentence.charAt(i)-'a']=true;

        }

for(int i=0;i<26;i++){
    if(bl[i]==false){
        return false;
    }
}
           
           return true;



    }

}
