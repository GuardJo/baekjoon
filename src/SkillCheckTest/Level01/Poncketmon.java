package SkillCheckTest.Level01;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 프로그래머스 level 1
 * 폰켓몬
 */
public class Poncketmon {
    private static Solution solution = new Solution();

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 3};
        int result = solution.solution(nums);

        System.out.println(result);
    }

    private static class Solution {
        public int solution(int[] nums) {
            int answer = 0;
            Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());

            answer = set.size();

            return (answer > (nums.length / 2)) ? nums.length / 2 : answer;
        }
    }
}
