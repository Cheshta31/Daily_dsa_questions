class Solution {
    public int largestRectangleArea(int[] heights) {

        int n = heights.length;

        ArrayDeque<Integer> st1 = new ArrayDeque<>();
        ArrayDeque<Integer> st2 = new ArrayDeque<>();

        int left[] = new int[n];
        int right[] = new int[n];

        //previous smaller element
        for(int i = 0; i < n; i++){

            int num = heights[i];

            while(!st1.isEmpty() && heights[st1.peek()] > num)
                st1.pop();

            if(st1.isEmpty())
                left[i] = -1;
            else 
                left[i] = st1.peek();

            st1.push(i);            

        }

        //next greater element
        for(int i = n-1; i >= 0; i--){

            int num = heights[i];

            while(!st2.isEmpty() && heights[st2.peek()] >= num)
                st2.pop();

            if(st2.isEmpty())
                right[i] = n;
            else 
                right[i] = st2.peek();

            st2.push(i);            

        }

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){

            int sum = (right[i] - left[i] - 1) * heights[i];
            max = Math.max(max, sum); 

        }

        return max;
            
    }
}
