https://leetcode.com/problems/container-with-most-water/description/

class Solution {
    public int maxArea(int[] h) {
        int s=0,e=h.length-1;
int max_area=0;
        while(s<e){
            int area=Math.min(h[s],h[e])*(e-s);
            if(area>max_area)
            max_area=area;

            if(h[s]<h[e]){
                s++;
            }
            else{
               e--;
            }


        }
        return max_area;
    }
}
