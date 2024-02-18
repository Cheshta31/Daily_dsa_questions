class Solution {
    public int mostFrequentEven(int[] nums) {
        int element = Integer.MAX_VALUE;
        int maxCount = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        
        for(int i = 0; i < n; i++){
            if(nums[i] % 2 == 0){
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
                if(map.get(nums[i]) > maxCount){
                    maxCount = map.get(nums[i]);
                } 
            }
        }
        
        for(int key : map.keySet()){
           if(map.get(key) == maxCount){
                 element = Math.min(element,key);
           }
        }
        if(element == Integer.MAX_VALUE){
            return -1;
        }
        return element;
    }
}
