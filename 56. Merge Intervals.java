class Solution {
    public int[][] merge(int[][] A) {
	// sorting the array with the start value
        Arrays.sort(A, (a,b)-> a[0]-b[0]);
		// for keep the count of the ans intervals
        int n = A.length;
        for(int i=1;i<A.length;i++){
		// checking  if the start of the current is <= end of previous
		// merging the interval and setting the previous one as -1
            if(A[i][0] <= A[i-1][1]){
                A[i][1] = Math.max(A[i-1][1],A[i][1]);
                A[i][0] = A[i-1][0];
                A[i-1][0] = -1;
                A[i-1][1] = -1;n--;
            }
        }
        
        int[][] ans = new int[n][2];
        
        int i=0;
	
        for(int[] a : A){
		// including all the positive answers in the answer array
            if(a[0]!= -1){
                ans[i][0] = a[0];
                ans[i][1] = a[1];
                i++;
            }
        }
        
        return ans;
        
    }
}
