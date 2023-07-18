package baekjoon.p3x;

import java.io.*;

/**
 * <h1>킹, 퀸, 룩, 비숍, 나이트, 폰</h1>
 * <p>백준 문제</p>
 * <a href="https://www.acmicpc.net/problem/3003">문제 링크</a>
 */
public class p3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strings = br.readLine().split(" ");
        int[] input = new int[strings.length];

        for (int i = 0; i < input.length; i++) {
            input[i] = Integer.parseInt(strings[i]);
        }

        bw.write(solution(input));

        br.close();
        bw.flush();
        bw.close();
    }

    private static String solution(int[] input) {
        int[] maxCount = {1, 1, 2, 2, 2, 8};
        String answer = "";

        for (int i = 0; i < maxCount.length; i++) {
            int num = maxCount[i] - input[i];
            answer += num + " ";
        }

        return answer.substring(0, answer.length() - 1);
    }
}
