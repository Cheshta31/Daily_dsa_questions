question link--->>https://leetcode.com/problems/find-common-characters/description/
class Solution {
    public List<String> commonChars(String[] words) {
        List<String> res = new ArrayList<>();
        int[] cnt = new int[0];

        for (int i = 0; i < words.length; i++) {
            if (i == 0) 
                cnt = count(words[i]);
            else 
                intersect(cnt, count(words[i]));
        }

        for (int i = 0; i < cnt.length; i++)
            while (cnt[i]-- > 0)
                res.add(String.valueOf((char)(i + 'a')));

        return res;
    }

    private int[] count(String str) {
        int[] cnt = new int[26];
        for (int i = 0; i < str.length(); i++)
            ++cnt[str.charAt(i) - 'a'];
        return cnt;
    }

    private void intersect(int[] cnt1, int[] cnt2) {
        for (int i = 0; i < cnt1.length; i++)
            cnt1[i] = Math.min(cnt1[i], cnt2[i]);
    }
}
