https://leetcode.com/problems/word-pattern/description/

class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String>  mp=new HashMap<>();
        Set<String> st=new HashSet<>();
        String [] arr=s.split(" ");
        int n=arr.length;
        if(n!=pattern.length())
        return false;

        for(int i=0;i<n;i++){
            String word=arr[i];
            char ch=pattern.charAt(i);

            if(mp.containsKey(ch)){
                if(!(mp.get(ch).equals(word))){
                    return false;
                }

            }
            else{
                if(st.contains(word)){
                    return false;
                }
                else{
                    mp.put(ch,word);
                    st.add(word);
                }
            }

        }
        return true;
    }
}
