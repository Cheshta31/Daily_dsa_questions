class Solution {
    public int findMaxLength(int[] nums) {
        
HashMap<Integer,Integer> hs=new HashMap<>();
int sum=0,len=0;int digit=-2;
for(int i=0;i<nums.length;i++){
sum+=nums[i]==0?-1:1;
if(sum==0){
    len=Math.max(len,i+1);
}
else if(hs.containsKey(sum)){
    len=Math.max(len,i-hs.get(sum));
}else{
hs.put(sum,i);
}
}
return len;

    }
}
