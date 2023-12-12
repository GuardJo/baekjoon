package dec_12_2023;

import java.util.Arrays;

public class SuperstarMg {
    public static void main(String[] args) {
        int[][] judge = {{10, 30, 50, 80, 80}, {40, 20, 20, 10, 50}};
        int[][] music = {{13, 3, 5, 8}, {9, 34, 9, 10}};

        int[] answer = solution(judge, music);

        System.out.println(answer[0] + " " + answer[1]);
    }

    private static int[] solution(int[][] judges, int[][] musics) {
        int[] answer = new int[2];

        for (int i = 0; i < judges.length; i++) {
            int[] judge = judges[i];
            int[] music = musics[i];

            Arrays.sort(judge);
            Arrays.sort(music);

            int judgeScore = Arrays.stream(judge).sum() - judge[0] - judge[judge.length - 1];
            int musicScore = music[music.length - 1] + music[music.length - 2] - music[0] - music[1];

            int totalScore = judgeScore * musicScore;

            if (totalScore > answer[1]) {
                answer[0] = i + 1;
                answer[1] = totalScore;
            }
        }

        return answer;
    }
}
