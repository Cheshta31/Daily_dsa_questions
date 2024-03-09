https://leetcode.com/problems/minimum-common-value/description/

class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        
HashMap<Integer,Integer> hs=new HashMap<>();
for(int i=0;i<nums1.length;i++){
    hs.put(nums1[i],hs.getOrDefault(nums1[i],0)+1);
}
for(int i=0;i<nums2.length;i++){
    if(hs.containsKey(nums2[i])){
        return nums2[i];
        
    }
}

return -1;

    }
}
