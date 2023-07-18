package baekjoon.p2x;

import java.io.*;

/**
 * <h1>별 찍기 - 7</h1>
 * <p>백준 문제</p>
 * <a href="https://www.acmicpc.net/problem/2444">문제 링크</a>
 */
public class p2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        String output = solution(size);

        bw.write(output);

        br.close();
        bw.flush();
        bw.close();
    }

    private static String solution(int size) {
        StringBuilder stringBuilder = new StringBuilder();
        int length = -1;

        for (int i = 0; i < (size * 2 - 1); i++) {
            if (i < size) {
                length += 2;

                for (int j = 0; j < (size - 1 - i); j++) {
                    stringBuilder.append(" ");
                }

                for (int j = 0; j < length; j++) {
                    stringBuilder.append("*");
                }

                stringBuilder.append("\n");
            } else {
                length -= 2;

                for (int j = 0; j < (i - (size - 1)); j++) {
                    stringBuilder.append(" ");
                }

                for (int j = 0; j < length; j++) {
                    stringBuilder.append("*");
                }

                stringBuilder.append("\n");
            }
        }

        return stringBuilder.toString();
    }
}
