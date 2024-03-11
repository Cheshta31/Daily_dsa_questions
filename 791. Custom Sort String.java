class Solution {
    public String customSortString(String order, String s) {
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<>();
        int ca[] = new int[26];
        for (char i : order.toCharArray()) {
            set.add(i);
        }
        for (char i : s.toCharArray()) {
                if(!set.contains(i)){
                    sb.append(i);
                }
                else{
                    ca[i-'a']++;
                }
        }
for(char c:order.toCharArray()){
    int i=ca[c-'a'];
    while(i-->0){
        sb.append(c);
    }
}

return sb.toString();
    }
}
