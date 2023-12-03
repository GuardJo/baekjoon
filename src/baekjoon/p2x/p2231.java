package baekjoon.p2x;

import java.io.*;
import java.util.Arrays;

/**
 * <h1>분해합</h1>
 * <p>백준 문제</p>
 * <a href="https://www.acmicpc.net/problem/2231">문제 링크</a>
 */
public class p2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());

        int result = calc(input);

        bw.write(String.valueOf(result));

        br.close();
        bw.flush();
        bw.close();
    }

    private static int calc(int input) {
        int answer = 0;
        for (int i = 1; i < input; i++) {
            int sum = calc2(i);

            if (sum == input) {
                return i;
            }
        }

        return answer;
    }

    private static int calc2(int number) {
        int base = number;
        int subSum = Arrays.stream(String.valueOf(number).split(""))
                .mapToInt(Integer::parseInt)
                .sum();

        return base + subSum;
    }
}
