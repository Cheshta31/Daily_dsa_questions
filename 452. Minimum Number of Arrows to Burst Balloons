class Solution {
    public int findMinArrowShots(int[][] points) {

        int n = points.length;

        Arrays.sort(points, Comparator.comparingInt(o -> o[1]));

        int count = 1;
        int lastEndPoint = points[0][1];

        for (int i = 1; i < n; i++) {
            int curr_startPoint = points[i][0];

            if (curr_startPoint > lastEndPoint) {
                count++;
                lastEndPoint = points[i][1];
            }
        }

        return count;

    }
}
