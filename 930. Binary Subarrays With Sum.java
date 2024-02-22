class Solution {
    public int numSubarraysWithSum(int[] nums, int k) {
     HashMap<Integer, Integer> map = new HashMap<>();
int count = 0;
int currentSum = 0;
//int[] psa = new int[nums.length];
for (int i = 0; i < nums.length; i++) {
currentSum += nums[i];
if (currentSum == k) {
count++;
}
if (map.containsKey(currentSum - k)) {
count += map.get(currentSum - k);
}
map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
}
return count;   
    }
}
