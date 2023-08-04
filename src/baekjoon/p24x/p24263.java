package baekjoon.p24x;

import java.io.*;

/**
 * <h1>알고리즘 수업 - 알고리즘의 수행 시간 2</h1>
 * <p>백준 문제</p>
 * <a href="https://www.acmicpc.net/problem/24263">문제 링크</a>
 * <hr>
 * <p>주어진 알고리즘</p>
 * <pre>
 * MenOfPassion(A[], n) {
 *     sum <- 0;
 *     for i <- 1 to n
 *         sum <- sum + A[i]; # 코드1
 *     return sum;
 * }
 * </pre>
 */
public class p24263 {
    public static void main(String[] args) throws IOException {
        // 주어진 알고리즘의 수행시간은 n에 비례함
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(input));
        bw.newLine();
        bw.write("1");

        br.close();
        bw.flush();
        bw.close();
    }
}
