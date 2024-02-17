https://leetcode.com/problems/distribute-candies/

class Solution {
    public int distributeCandies(int[] ct) {

      HashSet<Integer> hs =new HashSet<>();
      int n=ct.length/2;

      for(int i=0;i<ct.length;i++){
     hs.add(ct[i]);
      }
if(hs.size()>=n){
    return n;
}
          
return hs.size();

    }
}
