package SkillCheckTest.Level01;

import java.io.*;

public class NumberToArrayAfterChageReversing {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long n = Long.parseLong(br.readLine());
        int[] result = solution(n);

        for(int i = 0; i < result.length; i++) {
            bw.write(result[i] + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    private static int[] solution(long n) {
        int[] answer = {};
        String[] str = String.valueOf(n).split("");
        answer = new int[str.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(str[str.length-1-i]);
        }

        return answer;
    }
}
