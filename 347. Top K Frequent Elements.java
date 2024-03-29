https://github.com/mmayank591/Leetcode_dsa_problems/tree/main

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int [] ans = new int[k];
        HashMap <Integer,Integer> map =new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
       List<Integer> l = new ArrayList<>(map.keySet());
        Collections.sort(l, (a, b) -> map.get(b) - map.get(a));
        for (int i = 0; i < k; i++) {
            ans[i] = l.get(i);
        }    
    return ans;
    }
}
