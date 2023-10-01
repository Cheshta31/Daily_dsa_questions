https://leetcode.com/problems/reverse-words-in-a-string-iii/description/

class Solution {
    public String reverseWords(String s) {
        // Split input string into array of words
        String[] data = s.split(" ");
        // declare LinkedList to store our reversed words.
        List<String> result = new LinkedList<>();
        // iterate over each word
        for(int i = 0; i < data.length; i++) {
            // create StringBuilder on each iteration, to store reverse word
            StringBuilder reverse = new StringBuilder();
            // iterate over each word in reverse order
            for(int pointer = data[i].length() - 1; pointer >= 0; pointer--) {
                // append each char into StringBulder
                reverse.append(data[i].charAt(pointer));
            }
            // create string from StringBuilder and then add it into List
            result.add(reverse.toString());
        }
        // join List with blank space delimeter and return it.
        return String.join(" ", result);
    }
}
