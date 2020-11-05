package SkillCheckTest.Level01;

import java.io.*;

public class SeperateDigitAllSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int result = solution(n);

        bw.write(result + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    private static int solution(int n) {
        int answer = 0;
        String s = Integer.toString(n);
        String[] str = s.split("");

        for (int i = 0; i < str.length; i++) {
            answer += Integer.parseInt(str[i]);
        }
        return answer;
    }
}
