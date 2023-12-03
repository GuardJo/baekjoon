package baekjoon.p19x;

import java.io.*;
import java.util.Arrays;

/**
 * <h1>수학은 비대면강의입니다</h1>
 * <p>백준 문제</p>
 * <a href="https://www.acmicpc.net/problem/19532">문제 링크</a>
 */
public class p19532 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] inputs = Arrays.stream(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                                .toArray();

        int[] result = calc(inputs);
        System.out.println(result[0] + " " + result[1]);

        br.close();
        bw.flush();
        bw.close();
    }

    private static int[] calc(int[] inputs) {
        int[] result = {0, 0};
        int a = inputs[0];
        int b = inputs[1];
        int c = inputs[2];
        int d = inputs[3];
        int e = inputs[4];
        int f = inputs[5];

        for (int i = -999; i < 1000; i++) {
            for (int j = -999; j < 1000; j++) {
                if ((a * i) + (b * j) == c && (d * i) + (e * j) == f) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }

        return result;
    }
}
