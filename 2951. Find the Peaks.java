https://leetcode.com/problems/find-the-peaks/description/


class Solution {
    public List<Integer> findPeaks(int[] arr) {
        
List<Integer> al=new ArrayList<>();
for(int i=1;i<arr.length-1;i++){
if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
al.add(i);
}

}
return al;

    }
}
