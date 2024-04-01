class Solution {
    public int lengthOfLastWord(String s) {

        String s1 = s.trim();
        String s2 = " ";
        int n = s1.length();
        for (int i = n - 1; i >= 0; i--) {
            char ch = s1.charAt(i);
            s2 += ch;

            if (ch == ' ') {
                break;
            }

        }
        System.out.println(s2);
        s2 = s2.trim();
        return s2.length();
    }
}
