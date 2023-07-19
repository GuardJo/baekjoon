package baekjoon.p10x;

import java.io.*;

/**
 * <h1>세로읽기</h1>
 * <p>백준 문제</p>
 * <a href="https://www.acmicpc.net/problem/10798">문제 링크</a>
 */
public class p10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[][] inputs = new String[5][15];

        for (String[] strings : inputs) {
            String[] input = br.readLine().split("");
            System.arraycopy(input, 0, strings, 0, input.length);
        }

        bw.write(solution(inputs));

        br.close();
        bw.flush();
        bw.close();
    }

    private static String solution(String[][] inputs) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < inputs[0].length; i++) {
            for (int j = 0; j < inputs.length; j++) {
                String str = inputs[j][i];
                if (!(str == null || str.isBlank() || str.isEmpty())) {
                    sb.append(str);
                }
            }
        }

        return sb.toString();
    }
}
