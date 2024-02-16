
https://leetcode.com/problems/count-elements-with-maximum-frequency/
class Solution {
    public int maxFrequencyElements(int[] nums) {
        
HashMap<Integer,Integer> hs =new HashMap<>();
for(int i=0;i<nums.length;i++){
      hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
      
}
int maxkey=Collections.max(hs.entrySet(), Map.Entry.comparingByValue()).getKey();
int maxvalue=hs.get(maxkey);
int count=0;
for(int key:hs.keySet()){
    if(hs.get(key)==maxvalue){
        count+=hs.get(key);
    }
}
return count;
    }
}
