package SkillCheckTest.Level01;

import java.util.ArrayList;
import java.util.Arrays;

public class SelectNumberOfIndex {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] command = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] result = solution(array, command);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    private static int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < commands.length; i++) {
            int indexX = commands[i][0] - 1;
            int indexY = commands[i][1] - 1;
            int indexZ = commands[i][2] - 1;
            int[] tmp = new int[indexY - indexX + 1];
            for (int j = 0; j < tmp.length; j++) {
                tmp[j] = array[indexX];
                indexX++;
            }
            Arrays.sort(tmp);
            list.add(tmp[indexZ]);
        }

        answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
