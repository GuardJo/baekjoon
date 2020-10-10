package SkillCheckTest.Level01;


import java.util.Arrays;

public class p2 {
    public static void main(String[] args) {
        String s = "Zbcdefg";
        String result = solution(s);

        System.out.println(result);
    }

    private static String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        Arrays.sort(str);

        for (int i = str.length-1; i >= 0; i--) {
            answer += str[i];
        }
        return answer;
    }
}
