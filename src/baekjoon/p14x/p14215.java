package baekjoon.p14x;

import java.io.*;
import java.util.Arrays;

/**
 * <h1>세 막대</h1>
 * <p>백준 문제</p>
 * <a href="https://www.acmicpc.net/problem/14215">문제 링크</a>
 */
public class p14215 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");
        int[] data = Arrays.stream(Arrays.stream(inputs)
                        .map(Integer::parseInt)
                        .toArray(Integer[]::new))
                .mapToInt(Integer::intValue)
                .toArray();

        bw.write(String.valueOf(solution(data)));

        br.close();
        bw.flush();
        bw.close();
    }

    private static int solution(int[] data) {
        Arrays.sort(data);

        int min1 = data[0];
        int min2 = data[1];
        int max = data[2];

        if ((min1 + min2) > max) {
            return min1 + min2 + max;
        } else {
            return ((min1 + min2) * 2) - 1;
        }
    }
}
