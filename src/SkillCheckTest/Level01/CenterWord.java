package SkillCheckTest.Level01;

public class CenterWord {
    public static void main(String[] args) {
        String s = "abcde";
        String result = solution(s);

        System.out.println(result);
    }

    private static String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        int index = str.length / 2;
        if (str.length % 2 == 0) {
            answer += str[index-1];
        }
        answer += str[index];
        return answer;
    }
}
