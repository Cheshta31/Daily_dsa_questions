https://leetcode.com/problems/intersection-of-two-arrays/
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs=new HashSet<Integer>();

        for(int i=0;i<nums1.length;i++){
            hs.add(nums1[i]);
        }
        List<Integer> al=new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            int a=nums2[i];
            if(hs.contains(a)){
                al.add(a);
                hs.remove(a);
            }
        }
int ans[]=new int[al.size()];
for(int i=0;i<ans.length;i++){
    ans[i]=al.get(i);
}
  return ans;      
    }
}
