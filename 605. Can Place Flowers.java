class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0)
            return true;
       int len= flowerbed.length;
       int c=0;
       for(int i=0;i<len;i++)
       {
        int l=0;
        int r=0;
        int v=i-1;
        if(v<0)
            l=0;
        else
            l=flowerbed[v];
        v=i+1;
        if(v==len)
            r=0;
        else
            r=flowerbed[v];
        if(l==0 && r==0 && flowerbed[i]!=1)
        {
            flowerbed[i]=1;
            n--;  
        }
        if(n==0)
            return true;
       }
       return false;

}
}
