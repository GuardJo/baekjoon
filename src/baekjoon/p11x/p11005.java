package baekjoon.p11x;

import java.io.*;

/**
 * <h1>진법 변환 2</h1>
 * <p>백준 문제</p>
 * <a href="https://www.acmicpc.net/problem/11005">문제 링크</a>
 */
public class p11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");
        int number = Integer.parseInt(inputs[0]);
        int base = Integer.parseInt(inputs[1]);

        bw.write(solution(number, base) + "");

        br.close();
        bw.flush();
        bw.close();
    }

    private static String solution(int number, int base) {
        return Integer.toString(number, base).toUpperCase();
    }
}
