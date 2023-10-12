https://leetcode.com/problems/relative-sort-array/description/

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int arr[]=new int [1001];
        for(int num:arr1){
            arr[num]++;
        }
        int ans[]=new int [arr1.length];
int i=0;
        for(int num:arr2){
            while(arr[num]>0){
                    ans[i]=num;
                    i++;
                    arr[num]--;
            }
        }
        for(int j=0;j<arr.length;j++){
            while(arr[j]>0){
                ans[i]=j;
                i++;
                arr[j]--;
            }
        }

            return ans;

    }
}
