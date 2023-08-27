questionlink-->>>https://leetcode.com/problems/di-string-match/description/
class Solution {
    public int[] diStringMatch(String s) {
        int low=0,high=s.length();
        int answer[]=new int [s.length()+1];
        for(int i=0;i<s.length();i++ ){
            if(s.charAt(i)=='I'){
                answer[i]=low;
                low++;
            }

            else{
                answer[i]=high;
                high--;
            }
        }
answer[s.length()]=high;
return answer;

    }
}
