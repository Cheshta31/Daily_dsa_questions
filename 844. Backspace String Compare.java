https://leetcode.com/problems/backspace-string-compare/?envType=daily-question&envId=2023-10-19

class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        Stack <Character> s1= new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if(!(s1.empty()) && s.charAt(i)=='#'){
                        s1.pop();
            }
            else{
                 if(s.charAt(i)!='#')
                s1.push(s.charAt(i));
            }
        }
         Stack <Character> s2= new Stack<Character>();
          for(int i=0;i<t.length();i++){
            if(!(s2.empty()) && t.charAt(i)=='#'){
                        s2.pop();
            }
            else{
                if(t.charAt(i)!='#')
                s2.push(t.charAt(i));
            }
        }
        String c1=s1.toString();
        String c2=s2.toString();
        System.out.println(s1);
        System.out.println(s2);
        if(c1.equals(c2)){
            return true;

        }
        return false;

    }
}
