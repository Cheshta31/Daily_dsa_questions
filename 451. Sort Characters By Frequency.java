class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) 
            map.put(c, map.getOrDefault(c, 0) + 1);
        // we have to sort it character wise
        List<Character> sort_ch = new ArrayList<>(map.keySet());
        sort_ch.sort((a, b) -> map.get(b) - map.get(a));

        StringBuilder ans = new StringBuilder();
        for(char c : sort_ch){
            int freq = map.get(c);
            for(int i=0; i<freq; i++){
                ans.append(c);
            }
        } 
        return ans.toString();
    }
}
