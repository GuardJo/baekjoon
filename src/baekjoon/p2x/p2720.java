package baekjoon.p2x;

import java.io.*;
import java.util.Arrays;

/**
 * <h1>세탁소 사장 동혁</h1>
 * <p>백준 문제</p>
 * <a href="https://www.acmicpc.net/problem/2720">문제 링크</a>
 */
public class p2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(br.readLine());
        int[] inputs = new int[size];

        for (int i = 0; i < size; i++) {
            inputs[i] = Integer.parseInt(br.readLine());
            bw.write(solution(inputs[i]));
            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }

    private static String solution(int number) {
        StringBuilder sb = new StringBuilder();
        int[] cents = {25, 10, 5, 1};
        int[] result = new int[cents.length];

        for (int i = 0; i < cents.length; i++) {
            int cent = cents[i];

            if (number == 0) {
                break;
            }

            result[i] = number / cent;

            number %= cent;
        }

        Arrays.stream(result)
                .forEach(n -> sb.append(n).append(" "));

        return sb.substring(0, sb.length() - 1);
    }
}
