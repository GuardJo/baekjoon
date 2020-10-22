package SkillCheckTest.Level01;

import java.util.ArrayList;
import java.util.Collections;

public class DivisionArray {
    public static void main(String[] args) {
        int[] arr = {5, 9, 7 , 10};
        int divisor = 5;
        int[] result = solution(arr, divisor);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    private static int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }
        Collections.sort(list);
        if (list.size() == 0) {
            answer = new int[1];
            answer[0] = -1;
        }
        else {
            answer = new int[list.size()];
        }

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
