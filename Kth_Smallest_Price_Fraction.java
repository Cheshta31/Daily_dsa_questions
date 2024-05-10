class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int n=arr.length;
        PriorityQueue<double[]> pq = new PriorityQueue<>(
        new Comparator<double []>()
            {
                public int compare(double arr1[],double arr2[])
                {
                if(arr1[0]<arr2[0])
                {
                    return -1;
                }
                return 1;
            }});
            for(int i=0;i<n-1;i++)
            {
                double primeFac = 1.0*arr[i]/arr[n-1];
                pq.offer(new double[]{primeFac,i,n-1});
            }
        int res[] = new int[2];
        while(k>0)
        {
            double currVal[] = pq.poll();
            int numIdx = (int) currVal[1];
            int denIdx = (int) currVal[2];
            int nextDenIdx = denIdx - 1;
            if(numIdx < denIdx) 
            {
             double primeFac = 1.0*arr[numIdx]/arr[nextDenIdx];
                pq.offer(new double[]{primeFac,numIdx,nextDenIdx});
                k--;
                if(k==0)
                {
                    res[0]=arr[numIdx];
                    res[1]=arr[denIdx];
                }
               
            }
        }
        return res;
    }
}
