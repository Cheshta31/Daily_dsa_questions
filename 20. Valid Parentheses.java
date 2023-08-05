question link--=-->https://leetcode.com/problems/valid-parentheses/description/


  class Solution {
    public boolean isValid(String s) {
   Stack<Character> stack = new Stack<Character>();int size=0;
    for(int i=0;i<s.length();i++){
        char x=s.charAt(i);
        if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
          stack.push(x);
            size++;
        }
        else{
            if(stack.empty()==true){
                return false;
            }
            else if((x==')')&&stack.peek()!='('){
                return false;
            }
             else if((x==']')&&stack.peek()!='['){
                return false;
            }
             else if((x=='}')&&stack.peek()!='{'){
                return false;
                }
            else{
                stack.pop();
            }  
    }

    }
    return (stack.empty());
}

}
