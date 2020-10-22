package SkillCheckTest.Level01;

import java.util.Arrays;
import java.util.Comparator;

public class SortStringInMyStyle {
    public static void main(String[] args) {
        String[] strings = {"abce", "abcd", "cdx"};
        int n = 2;
        String[] result = solution(strings, n);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    private static String[] solution(String[] strings, int n) {
        String[] answer = {};
        answer = new String[strings.length];
        Arrays.sort(strings);
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] str1 = o1.split("");
                String[] str2 = o2.split("");
                if (str1[n].compareTo(str2[n]) == 0) {
                    return 0;
                }
                return str1[n].compareTo(str2[n]);
            }
        });
        answer = strings;
        return answer;
    }
}
