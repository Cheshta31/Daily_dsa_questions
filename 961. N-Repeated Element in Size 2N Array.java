class Solution {
    public int repeatedNTimes(int[] nums) {

HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
int len=nums.length;
for(int i=0;i<nums.length;i++){
    hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);

}
for(int i=0;i<len;i++){
    if(hs.get(nums[i])==len/2){
        return nums[i];
    }
}
return -1;
    }
}
