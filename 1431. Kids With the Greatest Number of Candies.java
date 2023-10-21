
https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/

class Solution {
    public List<Boolean> kidsWithCandies(int[] can, int extraCandies) {
        int max=-1;
        ArrayList<Boolean> res=new ArrayList<Boolean>();
        for(int i=0;i<can.length;i++){
            if(can[i]>max){
                max=can[i];
            }
        }
for(int i=0;i<can.length;i++){
    if(can[i]+extraCandies >=max){
        res.add(true);

    }
    else{
        res.add(false);
    }
}
return res;
    }
}
