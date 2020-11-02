package SkillCheckTest.Level01;

public class CizerEncryption {
    public static void main(String[] args) {
        String s = "Z";
        int n = 10;
        String result = solution(s, n);
        System.out.println(result);
    }

    private static String solution(String s, int n) {
        String answer = "";
        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            int sum = ch[i];
            if (ch[i] >= 'a' && ch[i] <= 'z') {
                sum += n;
                if (sum > 'z') {
                    sum -= 26;
                }
            }
            else if (ch[i] >= 'A' && ch[i] <= 'Z') {
                sum += n;
                if (sum > 'Z') {
                    sum -= 26;
                }
            }
            answer += (char)sum;
        }
        return answer;
    }
}
