class Solution {
    public int removeDuplicates(int[] nums) {
      
        ArrayList<Integer> h = new ArrayList<Integer>();
      for(int i=0;i<nums.length;i++){
          if(h.contains(nums[i])){
              continue;
          }
          else{
              h.add(nums[i]);
          }
      }  
      int n=h.size();
for(int j=0;j<n;j++){
nums[j]=h.get(j);
}
return n;
    }
}
