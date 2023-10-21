https://leetcode.com/problems/matrix-diagonal-sum/
class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        
int ans=0;int mid=n/2;
System.out.println(n);
System.out.println(mat[mid][mid]);

        for(int i=0;i<mat.length;i++){
            ans+=mat[i][i]+mat[i][n-i-1];
           


        }
 if(n%2==1){
                ans-=mat[mid][mid];
            }


return ans;
    }
}
