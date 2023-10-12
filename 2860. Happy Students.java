https://leetcode.com/problems/happy-students/description/
class Solution {
    public int countWays(List<Integer> nums) {
        Collections.sort(nums);
        int nss=0;
        int ways=0;
        
        
        for(int i=0;i<nums.size();i++){
            if(i==0 && nss<nums.get(i)){
            ways++;
            }
            if(i>0 && nss<nums.get(i)  && nss>nums.get(i-1)){
            ways++;
            }
            nss++;
        }
        if(nss>nums.get(nums.size()-1)){
            ways++;
        }
        
        return ways;
    }
}
