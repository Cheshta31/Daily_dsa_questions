https://www.codingninjas.com/studio/problems/longest-subarray-with-sum-k_6682399?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM

public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
int n=a.length;
long sum=a[0];
int maxlen=0;
int right=0,left=0;
while(right<n){

while(left<=right &&sum>k){
    sum-=a[left];
    left++;
}
if(sum==k){
    maxlen=Math.max(maxlen,right-left+1);
}

right++;
if(right<n){
    sum+=a[right];
}

}
return maxlen;

    }


}
