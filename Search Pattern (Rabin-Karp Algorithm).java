https://www.geeksforgeeks.org/problems/search-pattern-rabin-karp-algorithm--141631/1
class Solution
{
    
    ArrayList<Integer> search(String pattern, String text)
    {
        // your code here
        ArrayList<Integer> occurences=new ArrayList<>();
        int index=text.indexOf(pattern);
        while(index!=-1){
            occurences.add(index+1);
            index=text.indexOf(pattern,index+1);
        }
      
      return occurences;  
    }
}
