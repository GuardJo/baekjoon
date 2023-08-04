package baekjoon.p24x;

import java.io.*;
import java.text.DecimalFormat;

/**
 * <h1>알고리즘 수업 - 알고리즘의 수행 시간 4</h1>
 * <p>백준 문제</p>
 * <a href="https://www.acmicpc.net/problem/24265">문제 링크</a>
 * <hr>
 * <pre>
 * MenOfPassion(A[], n) {
 *     sum <- 0;
 *     for i <- 1 to n - 1
 *         for j <- i + 1 to n
 *             sum <- sum + A[i] × A[j]; # 코드1
 *     return sum;
 * }
 * </pre>
 */
public class p24265 {
    public static void main(String[] args) throws IOException {
        // 주어진 알고리즘은 대략 n^2 의 수행 시간을 지니며, 실제 수행횟수는 !(n - 1)임
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        long result = solution(input - 1);
        DecimalFormat decimalFormat = new DecimalFormat("0");

        bw.write(decimalFormat.format(result));
        bw.newLine();
        bw.write("2");

        br.close();
        bw.flush();
        bw.close();
    }

    private static long solution(int input) {
        long sum = 0L;

        while (input > 0) {
            sum += input;
            --input;
        }

        return sum;
    }
}
