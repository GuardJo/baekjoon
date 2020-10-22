package SkillCheckTest.Level01;

public class NumberToString {
    public static void main(String[] args) {
        String s = "1234";
        int result = solution(s);

        System.out.println(result);
    }

    private static int solution(String s) {
        int answer = 0;
        String[] str = s.split("");
        if (str[0].equals("+")) {
            answer += Integer.parseInt(s.substring(1));
        }
        else if (str[0].equals("-")){
            answer += -Integer.parseInt(s.substring(1));
        }
        else {
            answer += Integer.parseInt(s);
        }
        return answer;
    }
}
