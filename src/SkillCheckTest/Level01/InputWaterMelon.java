package SkillCheckTest.Level01;

public class InputWaterMelon {
    public static void main(String[] args) {
        int n = 10;
        String result = solution(n);

        System.out.println(result);
    }

    private static String solution(int n) {
        String answer = "";
        String[] s = {"수", "박"};

        for (int i = 0; i < n; i++) {
            answer += s[i % 2];
        }

        return answer;
    }
}
