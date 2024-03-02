https://www.codingninjas.com/studio/problems/longest-successive-elements_6811740?utm_source=striver&utm_medium=website&utm_campaign=codestudio_a_zcourse&leftPanelTabValue=PROBLEM

import java.util.*;

public class Solution {

    public static int longestSuccessiveElements(int[] a) {

        int n = a.length;

        int cnt = 1;

        int max = 1; 

        Arrays.sort(a);

 

        for (int i = 0; i < n - 1; i++) {

            if (a[i] == a[i + 1]) {

                continue; 

            }

            if (a[i] + 1 == a[i + 1]) {

                cnt++; 

                max = Math.max(max, cnt); 

            } else {

                cnt = 1; 

            }

        }

        return max;

    }

}
