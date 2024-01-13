class Solution {
    public int missingNumber(int[] a) {
        
int N=a.length;
int i=0;
Arrays.sort(a);
for( i=0;i<N;i++){
    if(a[i]!=i){
        return i;
    }
}

return i;


    }
}
