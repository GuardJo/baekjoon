package SkillCheckTest.Level01;

import java.io.*;

/**
 * 하샤드 수
 * x의 자릿수의 합으로 x가 나누어지면 하샤드 수
 */
public class HashadNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int x = Integer.parseInt(br.readLine());
        boolean result = solution(x);

        bw.write(result + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    private static boolean solution(int x) {
        boolean answer = false;
        String s = String.valueOf(x);
        String[] str = s.split("");
        int sum = 0;

        for (int i = 0; i < str.length; i++) {
            int n = Integer.parseInt(str[i]);
            sum += n;
        }

        if (x % sum == 0) {
            answer = true;
        }

        return answer;
    }
}
