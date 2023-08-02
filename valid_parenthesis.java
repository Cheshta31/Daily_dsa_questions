import java.util.*;

class Main
{
    static boolean isBalanced(String s)
    {
        Stack<Character> st = new Stack<Character>();
        for (char c : s.toCharArray())
        {
            if (c == '(' || c == '[' || c == '{')
            {
                st.push(c);
            }
            else
            {
                if (st.empty())
                {
                    return false;
                }
                else if (c == ')' && st.peek() != '(')
                {
                    return false;
                }
                else if (c == ']' && st.peek() != '[')
                {
                    return false;
                }
                else if (c == '}' && st.peek() != '{')
                {
                    return false;
                }
                else
                {
                    st.pop();
                }
            }
        }
        return st.empty();
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with parentheses: ");

        // Check if there is any input available
        if (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            if (isBalanced(s))
            {
                System.out.println("The parentheses in the string are balanced.");
            }
            else
            {
                System.out.println("The parentheses in the string are not balanced.");
            }
        }
    }
}
