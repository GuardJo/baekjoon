package SkillCheckTest.Level01;

import java.util.Stack;

/**
 * 프로그래머스 level 1
 * 소수 만들기
 */
public class PrimeNumberMakerWIthThreeNums {
    private static Solution solution = new Solution();

    public static void main(String[] args) {
        int[] nums = {1, 2, 7, 6, 4};
        int result = solution.solution(nums);

        System.out.println(result);
    }

    private static class Solution {
        private int result = 0;
        public int solution(int[] nums) {
            int answer = 0;
            Stack<Integer> stack = new Stack<>();

            for (int i = 0; i < nums.length; i++) {
                traverse(i, stack, nums);
            }

            return result;
        }

        public void traverse(int index, Stack<Integer> stack, int[] nums) {
            stack.push(nums[index++]);

            if (stack.size() == 3) {
                int sum = 0;
                for (Integer num : stack) {
                    sum += num;
                }

                if (isPrime(sum)) {
                    ++result;
                }

                stack.pop();
                return;
            }

            else if (index == nums.length) {
                stack.pop();
                return;
            }


            for (int i = index; i < nums.length; i++) {
                traverse(i, stack, nums);
            }

            stack.pop();
        }

        public boolean isPrime(int num) {
            if (num < 2) {
                return false;
            }
            else if (num == 2) {
                return true;
            }

            for (int i = 2; i < num; i++) {
                if ((num % i) == 0) {
                    return false;
                }
            }

            return true;
        }
    }
}
