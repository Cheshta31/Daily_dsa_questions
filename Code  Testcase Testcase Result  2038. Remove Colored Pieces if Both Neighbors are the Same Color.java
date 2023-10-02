questionlink--->>>https://leetcode.com/problems/remove-colored-pieces-if-both-neighbors-are-the-same-color/description/?envType=daily-question&envId=2023-10-02

class Solution {
    public boolean winnerOfGame(String colors) {
            int alisscore = 0;
    int bobscore = 0;
    char color[]=colors.toCharArray();
    for(int i=1; i<colors.length()-1; i++){
        char curr =  color[i];
        char prev = color[i-1];
        char next = color[i+1];
        if((curr == 'A') && (prev == 'A') && (next == 'A')){
            alisscore++;
            
        }
        else if((curr == 'B') && (prev == 'B') && (next == 'B')){
            bobscore++;
            
        }
    }
    return alisscore> bobscore;
      
}
    }
