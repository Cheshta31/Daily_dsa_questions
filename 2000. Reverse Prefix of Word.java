class Solution {
    public String reversePrefix(String word, char ch) {

        int index = word.indexOf(ch);
        if (index == -1) {
            // Character ch not found in word
            return word;
        }

        String s1 = word.substring(0, index + 1);
        StringBuilder input1 = new StringBuilder();
        input1.append(s1);
        input1.reverse();

        String finall = input1.toString().concat(word.substring(index + 1));
        return finall;
    }
}
