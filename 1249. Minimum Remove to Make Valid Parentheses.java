class Solution {
    public String minRemoveToMakeValid(String s) {
        HashSet<Integer> set = new HashSet<>();
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='('&&s.charAt(i)!=')')
                continue;
            if(s.charAt(i)=='(')
                st.push(i);
            else{
                if(!st.isEmpty()&&s.charAt(st.peek())=='(')
                    st.pop();
                else
                    set.add(i);
            }
        }
        while(!st.isEmpty()){
            set.add(st.pop());
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(!set.contains(i))
                sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
