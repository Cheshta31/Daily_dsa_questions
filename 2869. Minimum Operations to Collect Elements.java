https://leetcode.com/problems/minimum-operations-to-collect-elements/

class Solution {
    public int minOperations(List<Integer> nums, int k) {
        int count=0;int n=0;
        HashSet <Integer> hs=new HashSet<>();
         for(int i=nums.size()-1;i>=0;i--){
count++;
            if((nums.get(i)<=k ) && (!(hs.contains(nums.get(i))))){
               n++;
                hs.add(nums.get(i));
            }
            if(n==k){
                break;
            }

        }

return count;

    }
}
