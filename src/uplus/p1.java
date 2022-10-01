package uplus;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 애너그램
 */
public class p1 {
    private static class Solution {
        public int solution(int[] arr) {
            int answer = 0;

            Set<String> set = new HashSet<>();

            for (int num : arr) {
                String[] nums = Integer.toString(num).split("");
                Arrays.sort(nums);
                set.add(Arrays.toString(nums));
            }

            answer = set.size();

            return answer;
        }
    }

    public static void main(String[] args) {
        int[] arr = {112, 1814, 121, 1481, 1184};
        int result = new Solution().solution(arr);

        System.out.println(result);
    }
}
