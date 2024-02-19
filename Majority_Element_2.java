class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {                                                 //1
            if(ans.size()==0 || ans.get(0) != nums[i])
            {                                            //2
            int count=0;
            for(int j=0;j<n;j++)
            {                                               //3
                if(nums[i]==nums[j])
                {                                 //4
                    count++;
                }
            }
                if(count>n/3)
                {                                             // 5
                    ans.add(nums[i]);
                }                                        //5
            }
            if(ans.size()==2)
            {                      //6
                break;
            }                 //6
        }//1
        return ans;
    }
}
