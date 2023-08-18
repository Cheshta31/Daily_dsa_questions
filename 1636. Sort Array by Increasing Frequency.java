class Solution {
    public int[] frequencySort(int[] nums) {
        
        Map<Integer,Integer> map = new HashMap<>();
        
        int L = nums.length;
		
		//Store numbers with their occurences in Map
		
        for(int i=0;i<L;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                int g = map.get(nums[i]);
                ++g;
                map.put(nums[i],g);
            }
        }
       
        int index=0;
        while(!map.isEmpty()){
            int min=1000,k=0,v=0;
			
			//Select min occuring number and add it in array.
			
            for(Map.Entry<Integer,Integer> entry : map.entrySet()){
              
                
                v=entry.getValue();
                if(v<min){
                    k= entry.getKey();
                    min=v;
                }
                else if(v==min){
                    if(k<entry.getKey()){
                        k=entry.getKey();
                    }
                }
            }
            while(min!=0){
                nums[index]=k;
                index++;
                min--;
            }
            
            map.remove(k);
            
        }
        return nums;
        
    }
}
