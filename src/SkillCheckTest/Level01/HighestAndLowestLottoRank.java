package SkillCheckTest.Level01;

import java.util.Arrays;

/**
 * 프로그래머스 level 1
 * 로또의 최고 순위와 최저 순위
 */
public class HighestAndLowestLottoRank {
    private static Solution solution = new Solution();

    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        int[] result = solution.solution(lottos, win_nums);

        System.out.println(Arrays.toString(result));
    }

    private static class Solution {
        public int[] solution(int[] lottos, int[] win_nums) {
            int[] answer = new int[2];
            int winCount = 0;
            int zeroCount = 0;

            for (int num : lottos) {
                if (num == 0) {
                    zeroCount++;
                }
                else if (isWInNumber(num, win_nums)) {
                    winCount++;
                }
            }

            int highestRank = 7 - (winCount + zeroCount);
            int lowestRank = 7 - winCount;

            answer[0] = (highestRank > 6) ? 6 : highestRank;
            answer[1] = (lowestRank > 6) ? 6 : lowestRank;

            return answer;
        }

        public boolean isWInNumber(int num, int[] win_nums) {
            for (int win_num : win_nums) {
                if (num == win_num) {
                    return true;
                }
            }

            return false;
        }
    }
}
