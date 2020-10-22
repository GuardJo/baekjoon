package SkillCheckTest.Level01;

import java.util.ArrayList;

public class DeleteOverlapNumber {
    public static void main(String[] args) {
        int[] arr = {4, 4, 4, 3, 3};
        int[] result = solution(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    private static int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        int base = arr[0];
        list.add(base);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != base) {
                base = arr[i];
                list.add(base);
            }
        }
        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
