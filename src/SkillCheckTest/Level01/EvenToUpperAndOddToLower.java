package SkillCheckTest.Level01;

import java.io.*;

public class EvenToUpperAndOddToLower {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        String result = solution(s);

        System.out.println(result);

        br.close();
        bw.flush();
        bw.close();
    }

    private static String solution(String s) {
        String answer = "";
        char[] c = s.toCharArray();
        boolean isEven = true;

        for (int i = 0; i < c.length; i++) {
            if (c[i] != ' ') {
                if (isEven) {
                    c[i] = Character.toUpperCase(c[i]);
                    isEven = false;
                } else if (!isEven) {
                    c[i] = Character.toLowerCase(c[i]);
                    isEven = true;
                }
            }
            else {
                isEven = true;
            }
            answer += c[i];
        }
        return answer;
    }
}
