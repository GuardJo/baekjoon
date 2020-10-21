package SkillCheckTest.Level01;

import java.util.ArrayList;
import java.util.Collections;

public class PlusOfTwoElements {
    public static void main(String[] args) {
        int[] numbers = {2, 1, 3, 4, 1};
        int[] result = solution(numbers);

        for(int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    private static int[] solution(int[] numbers) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length-1; i++) {
            int base = numbers[i];
            for (int j = i+1; j < numbers.length; j++) {
                int element = base + numbers[j];
                if (!list.contains(element)) {
                    list.add(element);
                }
            }
        }
        Collections.sort(list);
        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
