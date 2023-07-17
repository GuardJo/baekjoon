package baekjoon.p5x;

import java.io.*;

/**
 * <h1>과제 안 내신 분..?</h1>
 * <p>백준 문제</p>
 * <a href="https://www.acmicpc.net/problem/5597">문제 링크</a>
 */
public class p5597 {
    private static final int INPUT_SIZE = 28;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] inputs = new int[INPUT_SIZE];

        for (int i = 0; i < INPUT_SIZE; i++) {
            inputs[i] = Integer.parseInt(br.readLine());
        }

        bw.write(solution(inputs));

        br.close();
        bw.flush();
        bw.close();
    }

    private static String solution(int[] inputs) {
        String answer = "";
        boolean[] checked = new boolean[INPUT_SIZE + 2];

        for (int n : inputs) {
            checked[n - 1] = true;
        }

        for (int i = 0; i < checked.length; i++) {
            if (!checked[i]) {
                answer += (i + 1) + " ";
            }
        }

        return answer.substring(0, answer.length() - 1);
    }
}
