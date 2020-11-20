package SkillCheckTest.Level01;

public class FailureRate {
    public static void main(String[] args) {
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        int[] result = solution(N, stages);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }

    private static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] challenges = new int[N];
        int[] success = new int[N];

        for (int i = 0; i < stages.length; i++) {
            if (stages[i] < stages.length) {
                challenges[stages[i]]++;
            }
        }

        return answer;
    }
}
