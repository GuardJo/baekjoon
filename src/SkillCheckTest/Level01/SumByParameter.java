package SkillCheckTest.Level01;

import java.io.*;

public class SumByParameter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int x = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        long[] result = solution(x, n);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();

        br.close();
        bw.flush();
        bw.close();
    }

    private static long[] solution(int x, int n) {
        long[] answer = new long[n];
        long base = x;

        for (int i = 0; i < answer.length; i++) {
            answer[i] = base;
            base += x;
        }

        return answer;
    }
}
