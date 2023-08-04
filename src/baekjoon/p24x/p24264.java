package baekjoon.p24x;

import java.io.*;
import java.text.DecimalFormat;

/**
 * <h1>알고리즘 수업 - 알고리즘의 수행 시간 3</h1>
 * <p>백준 문제</p>
 * <a href="https://www.acmicpc.net/problem/24264">문제 링크</a>
 * <hr>
 * <p>주어진 알고리즘</p>
 * <pre>
 * MenOfPassion(A[], n) {
 *     sum <- 0;
 *     for i <- 1 to n
 *         for j <- 1 to n
 *             sum <- sum + A[i] × A[j]; # 코드1
 *     return sum;
 * }
 * </pre>
 */
public class p24264 {
    public static void main(String[] args) throws IOException {
        // 주어진 알고리즘의 수행 시간은 n^2에 비례함
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long input = Long.parseLong(br.readLine());
        long result = (long) Math.pow(input, 2.0d);
        DecimalFormat decimalFormat = new DecimalFormat("0");

        bw.write(decimalFormat.format(result));
        bw.newLine();
        bw.write("2");
        br.close();
        bw.flush();
        bw.close();
    }
}
