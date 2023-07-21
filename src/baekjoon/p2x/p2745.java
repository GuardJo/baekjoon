package baekjoon.p2x;

import java.io.*;

/**
 * <h1>진법 변환</h1>
 * <p>백준 문제</p>
 * <a href="https://www.acmicpc.net/problem/2745">문제 링크</a>
 */
public class p2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");
        String input = inputs[0];
        int number = Integer.parseInt(inputs[1]);

        bw.write(solution(input, number) + "");

        br.close();
        bw.flush();
        bw.close();
    }

    private static int solution(String input, int number) {
        return Integer.parseInt(input, number);
    }
}
