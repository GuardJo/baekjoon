package SkillCheckTest.Level01;

import java.util.ArrayList;

public class p1 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        int[] result = solution(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    private static int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] answer;
        int tmp = arr[0];
        list.add(tmp);
        for (int i = 1; i < arr.length; i++) {
            if (tmp != arr[i]) {
                tmp = arr[i];
                list.add(tmp);
            }
        }
        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
