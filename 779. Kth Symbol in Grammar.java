https://leetcode.com/problems/k-th-symbol-in-grammar/description/

class Solution {

    private int helper(int n, int k){
        if(n == 1 && k == 1){
            return 0;
        }

        int mid = (int)Math.pow(2,n-1)/2;

        if(k <= mid)
            return helper(n-1, k);
  s      else{
            int result = helper(n-1, k-mid);
            return (result == 0) ? 1 : 0;

        }
    }
    public int kthGrammar(int n, int k) {
        return helper(n,k);
    }
}
