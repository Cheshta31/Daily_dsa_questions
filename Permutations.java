question link--->https://leetcode.com/submissions/detail/933191413/


class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        result.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            List<List<Integer>> newResult = new ArrayList<>();
            for (List<Integer> list : result) {
                for (int j = 0; j <= list.size(); j++) {
                    List<Integer> tempList = new ArrayList<>(list);
                    tempList.add(j, nums[i]);
                    newResult.add(tempList);
                }
            }
            result = newResult;
        }
        return result;
    }
}
