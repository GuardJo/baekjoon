package SkillCheckTest.Level02_2;

public class p1 {
    public static void main(String[] args) {
        int n = 16;
        int t = 16;
        int m = 2;
        int p = 1;
        String result = solution(n, t, m, p);

        System.out.println(result);
    }

    private static String solution(int n, int t, int m, int p) {
        String answer = "";
        String number = "";
        int num = 0;
        while (number.length() < (t * m)) {
            number += changeNumber(n, num);
            num++;
        }
        String[] str = number.split("");
        int base = p - 1;
        while (answer.length() < t) {
            answer += str[base];
            base += m;
        }
        answer = answer.toUpperCase();
        return answer;
    }

    private static String changeNumber(int n, int num) {
        String s = "";
        if (n == 2) {
            s = Integer.toBinaryString(num);
        }
        else if (n == 8) {
            s = Integer.toOctalString(num);
        }
        else if (n == 16) {
            s = Integer.toHexString(num);
        }
        else {
            s = Integer.toString(num);
        }
        return s;
    }
}
