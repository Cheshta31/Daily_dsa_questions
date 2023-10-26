https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/

class Solution {
    public int[] kWeakestRows(int[][] mat, int k1) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        int ans[]=new int[k1];
int count=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){

                        if(mat[i][j]==1){
                                    count++;
                        }                         
            }
                hs.put(i,count);
                         count=0;
        }
List<Integer> list = new ArrayList<>(hs.keySet());
 Collections.sort(list,(a,b)-> hs.get(a)-hs.get(b));
for(int i=0;i<k1;i++){
    ans[i]=list.get(i);
}
return ans;
    }
}
