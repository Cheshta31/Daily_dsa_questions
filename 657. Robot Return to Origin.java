https://leetcode.com/problems/robot-return-to-origin/description/
class Solution {
    public boolean judgeCircle(String moves) {
int xmag=0;
int ymag=0;
for(int i=0;i<moves.length();i++){
if(moves.charAt(i)=='U')
ymag+=1;
if(moves.charAt(i)=='D')
ymag-=1;
if(moves.charAt(i)=='R')
xmag+=1;
if(moves.charAt(i)=='L')
xmag-=1;
}
if(xmag==0 && ymag==0){
    return true;
}
else
return false;
    }
}
