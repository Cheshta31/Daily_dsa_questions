class Solution {
    public int minimumSum(int[] arr) {
        int ans = Integer.MAX_VALUE;
     int n=arr.length;
    // Generate all possible triplets
    for (int i = 0; i < n - 2; i++) 
    {
        for (int j = i + 1; j < n - 1; j++) 
        {
            for (int k = j + 1; k < n; k++)
            {
                // Calculate sum of each triplet
                // and update minimum
                if(i<j && j<k && arr[i]<arr[j] && arr[k]<arr[j])
                ans = Math.min(ans, arr[i] + 
                                arr[j] + arr[k]);
            }
        }
    }
        if (ans==Integer.MAX_VALUE)
        return -1;
        return ans;
        
    }
}
