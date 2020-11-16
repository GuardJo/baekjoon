package SkillCheckTest.Level01;

import java.util.Arrays;

public class MaxBudget {
    public static void main(String[] args) {
        int[] d = {1, 3, 2, 5, 4};
        int budget = 9;
        int result = solution(d, budget);

        System.out.println(result);
    }

    private static int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        int sum = 0;
        for (int i = 0; i < d.length; i++) {
            if (sum + d[i] > budget) {
                return answer;
            }
            sum += d[i];
            answer++;
        }

        return answer;
    }
}
