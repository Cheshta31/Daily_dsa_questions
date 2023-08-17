question link==>>https://leetcode.com/problems/relative-ranks/description/

  class Solution {
    public String[] findRelativeRanks(int[] arr) {
        HashMap<Integer, String> map = new HashMap<>();
        int rank = 4;
        int[] a = Arrays.copyOf(arr, arr.length);
        String[] array = new String[a.length];
        Arrays.sort(a);

        if(a.length == 1) {
            array[0] = "Gold Medal";
            return array;
        }

        if(a.length == 2){
            array[1] = "Gold Medal";
            array[0] = "Silver Medal";
            return array;
        }

        map.put(a[a.length - 1], "Gold Medal");
        map.put(a[a.length - 2], "Silver Medal");
        map.put(a[a.length - 3], "Bronze Medal");

        for (int i = a.length - 4; i >= 0; i--) {
            if (!map.containsKey(i))
             map.put(a[i], String.valueOf(rank++));
        }


        for (int i = 0; i < arr.length; i++) {
            array[i] = map.get(arr[i]);
        }
        return array;
    }}
