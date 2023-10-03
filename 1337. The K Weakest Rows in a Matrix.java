https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/description/?envType=daily-question&envId=2023-10-03

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) count++;
            }
            map.put(i, count);
        }

        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a, b) -> map.get(a) - map.get(b));

        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}
