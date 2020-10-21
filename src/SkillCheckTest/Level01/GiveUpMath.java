package SkillCheckTest.Level01;

import java.util.ArrayList;
import java.util.Collections;

public class GiveUpMath {
    public static void main(String[] args) {
        int[] answers = {1, 3, 2, 4, 2};
        int[] result = solution(answers);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    private static int[] solution(int[] answers) {
        int[] answer = {};
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] student = {0, 0, 0};
        int max = 0;

        for (int i = 0; i < student.length; i++) {
            if (i == 0) {
                student[i] = checkScore(one, answers);
            }
            else if (i == 1) {
                student[i] = checkScore(two, answers);
            }
            else {
                student[i] = checkScore(three, answers);
            }

            if (student[i] > max) {
                max = student[i];
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < student.length; i++) {
            if (student[i] == max) {
                list.add(i+1);
            }
        }
        Collections.sort(list);
        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    private static int checkScore(int[] arr, int[] answers) {
        int score = 0;
        int index = 0;

        for (int i = 0; i < answers.length; i++) {
            if (index >= arr.length) {
                index = 0;
            }
            if (answers[i] == arr[index]) {
                score++;
            }
            index++;
        }
        return score;
    }
}
