package SkillCheckTest.Level01;

/**
 * 프로그래머스 level 1
 * 최소 사각형
 */
public class MinimumRectangle {
    private static Solution solution = new Solution();

    public static void main(String[] args) {
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int result = solution.solution(sizes);

        System.out.println(result);
    }

    private static class Solution {
        public int solution(int[][] sizes) {
            int answer = 0;
            int maxRow = 0;
            int maxCol = 0;

            for (int i = 0; i < sizes.length; i++) {
                int row = sizes[i][0];
                int col = sizes[i][1];

                maxRow = Math.max(Math.max(row, col), maxRow);
                maxCol = Math.max(Math.min(row, col), maxCol);
            }

            answer = maxRow * maxCol;

            return answer;
        }
    }
}
