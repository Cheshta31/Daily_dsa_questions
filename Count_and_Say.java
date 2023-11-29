  class Solution {
        public String countAndSay(int n) {

            StringBuilder sb = new StringBuilder("1");

            for (int i = 2; i <= n; i++) {
                sb = helper(sb);
            }

            return sb.toString();
        }

        private StringBuilder helper(StringBuilder s) {

            StringBuilder sb = new StringBuilder();
            char currChar = s.charAt(0);
            int count = 1;

            s.append('#');
            for (int i = 1; i < s.length(); i++) {

                if (s.charAt(i) != currChar) {
                    sb = sb.append(count).append(currChar);
                    currChar = s.charAt(i);
                    count = 1;
                } else {
                    count++;
                }
            }

            return sb;
        }
    }
