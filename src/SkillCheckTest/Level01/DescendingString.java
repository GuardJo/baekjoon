package SkillCheckTest.Level01;

import java.util.Arrays;
import java.util.Comparator;

public class DescendingString {
    public static void main(String[] args) {
        String s = "Zbcdefg";
        String result = solution(s);

        System.out.println(result);
    }

    private static String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        for (int i = 0; i < str.length; i++) {
            answer += str[i];
        }
        return answer;
    }
}
