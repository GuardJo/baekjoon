package SkillCheckTest.Level02;

import java.util.ArrayList;
import java.util.Collections;

public class OneTwoThreeCountry {
    public static void main(String[] args) {
        int n = 30;
        String result = solution(n);

        System.out.println(result);
    }

    private static String solution(int n) {
        String answer = "";
        ArrayList<Integer> list = new ArrayList<>();
        if (n <= 3) {
            answer = String.valueOf(n);
        } else {
            while (n >= 3) {
                list.add(n % 3);
                n = n / 3;
            }
            list.add(n);
        }
        Collections.reverse(list);
        while (list.contains(0)) {
            if (list.get(0) == 0) {
                list.remove(0);
            }
            else {
                for (int i = 1; i < list.size(); i++) {
                    if (list.get(i) == 0) {
                        int tmp = list.get(i - 1);
                        list.remove(i);
                        list.remove(i - 1);
                        list.add(i - 1, tmp - 1);
                        list.add(i, 3);
                    }
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            answer += String.valueOf(list.get(i));
        }
        answer = answer.replaceAll("3", "4");
        return answer;
    }
}
