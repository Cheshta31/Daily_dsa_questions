questionlink-->>>https://leetcode.com/problems/truncate-sentence/description/

class Solution {
    public String truncateSentence(String s, int k) {
  int space_cnt=0;
        int i=0;
        
        for (i=0;i<s.length();i++){
            if (s.charAt(i) == ' ')
                space_cnt++;
            
            if (space_cnt==k)
                break;

        }
        if (i== s.length())
            return s;
        
        
        return s.substring(0,i);
    }
}
