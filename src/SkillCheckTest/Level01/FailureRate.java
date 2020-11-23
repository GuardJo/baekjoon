package SkillCheckTest.Level01;

import java.util.Arrays;
import java.util.Comparator;

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
        Stage[] s = new Stage[N];

        for (int i = 0; i < s.length; i++) {
            s[i] = new Stage(i + 1, 0, 0);
        }

        for (int i = 0; i < stages.length; i++) {
            for (int j = 0; j < stages[i] - 1; j++) {
                s[j].finish++;
            }
            if (stages[i] <= N) {
                s[stages[i] - 1].run++;
                s[stages[i] - 1].finish++;
            }
        }

        Arrays.sort(s, new Comparator<Stage>() {
            @Override
            public int compare(Stage o1, Stage o2) {
                double a = (double)o1.run / o1.finish;
                double b = (double)o2.run / o2.finish;
                if (a > b) {
                    return -1;
                }
                else if (a < b) {
                    return 1;
                }
                else {
                    return 0;
                }
            }
        });

        for (int i = 0; i < answer.length; i++) {
            answer[i] = s[i].num;
        }

        return answer;
    }

    private static class Stage {
        int num;
        int run;
        int finish;
        public Stage(int num, int run, int finish) {
            this.num = num;
            this.run = run;
            this.finish = finish;
        }
    }
}
