https://leetcode.com/problems/majority-element-ii/description/?envType=daily-question&envId=2023-10-05

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=(nums.length/3);
        HashMap<Integer,Integer> hs= new HashMap<>();
ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(hs.containsKey(nums[i])){
               hs.put(nums[i],hs.get(nums[i])+1);
            }
                else{
                    hs.put(nums[i],1);
                        }   
        }

for(int j: hs.keySet()){
    if(hs.get(j)>n){
        al.add(j);
    }
}

return al;


    }
}
