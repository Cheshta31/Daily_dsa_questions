https://leetcode.com/problems/intersection-of-two-arrays-ii/

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
ArrayList<Integer> al=new ArrayList<>();
for(int i:nums2){
    if(map.containsKey(i) && map.get(i)>0){
        al.add(i);
        map.put(i,map.get(i)-1);
    }
}

int index=0;
int ans[]=new int[al.size()];
for(int i:al){
    ans[index++]=i;
}
return ans;
    }
}
