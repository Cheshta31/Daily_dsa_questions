class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
HashMap<Integer,Integer> hs=new HashMap<>();
for(int i=0;i<arr.length;i++){ 
    hs.put(arr[i],hs.getOrDefault(arr[i],0)+1);
} 
         HashSet<Integer> set=new HashSet<>();
         for(int i:hs.keySet()){
             if(set.contains(hs.get(i))){
                 return false;
             }
             else{
                 set.add(hs.get(i));
             }
         }
        
         
return true;

    }
}
