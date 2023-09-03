class Solution {
    List<List<Integer>> res=new ArrayList();
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
                if(i==0||nums[i]!=nums[i-1])
            twosum(i+1,nums.length-1,nums,0-nums[i]);

        }
        return res;
    }

    public void twosum(int i,int j,int []nums,int target){
        int a1=nums[i-1];
        while(i<j){//search space
            if(nums[i]+nums[j]>target){
                j--;
            }
            else if(nums[i]+nums[j]<target){
                i++;
            }
            else{
                List<Integer> list=new ArrayList();
                list.add(a1);
                list.add(nums[i]);
                list.add(nums[j]);
                res.add(list);
                //dublicate b
                while(i<j && nums[i]==nums[i+1])i++;
                //duplicate
                while(i<j && nums[j]==nums[j-1])j--;
                 i++;j--;
            }
        }
    }
}
