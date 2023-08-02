class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length()!=goal.length()){
                return false;
        }
        HashSet<Character> h=new HashSet<>();
            if(s.equals(goal)){
                for(char c :s.toCharArray()){
                    h.add(c);
                }
                return !(s.length()==h.size());
            }


ArrayList <Integer> al=new ArrayList<>();
for(int i=0;i<s.length();i++){
    if(s.charAt(i)!=goal.charAt(i)){
        al.add(i);
    }
}
 if(al.size()!=2){
     return false;

 }
 return ((s.charAt(al.get(0)))==(goal.charAt(al.get(1))) && ( s.charAt(al.get(1))) == (goal.charAt(al.get(0))));

    }
}
