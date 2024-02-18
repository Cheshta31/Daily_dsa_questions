https://leetcode.com/problems/check-distances-between-same-letters/

class Solution {
    public boolean checkDistances(String s, int[] distance) {
int n=s.length();
for(int i=0;i<n;i++)
{
    char ch=s.charAt(i);
    int fi=s.indexOf(ch);
    int li=s.lastIndexOf(ch);
    int dist=(li-fi)-1;

    if(distance[ch - (char)97]==dist){
        continue;
    }
    else{
        return false;
    }
}
return true;

    }
}
