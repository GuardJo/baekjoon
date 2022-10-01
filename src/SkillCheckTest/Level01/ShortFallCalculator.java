package SkillCheckTest.Level01;

/**
 * 프로그래머스 level 1
 * 부족한 금액 계산하기
 */
public class ShortFallCalculator {
    private static Solution solution = new Solution();

    public static void main(String[] args) {
        int price = 3;
        int money = 20;
        int count = 4;
        long result = solution.solution(price, money, count);

        System.out.println(result);
    }

    private static class Solution {
        public long solution(int price, int money, int count) {
            long answer = 0;

            for (int i = 1; i <= count; i++) {
                answer += (price * i);
            }

            answer -= money;

            if (answer < 0) {
                answer = 0;
            }
            return answer;
        }
    }
}
