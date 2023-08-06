package baekjoon.p24x;

import java.io.*;

/**
 * <h1>알고리즘 수업 - 알고리즘의 수행 시간 6</h1>
 * <p>백준 문제</p>
 * <a href="https://www.acmicpc.net/problem/24267">문제 링크</a>
 * <hr>
 * <p>주어진 알고리즘</p>
 * <pre>
 * MenOfPassion(A[], n) {
 *     sum <- 0;
 *     for i <- 1 to n - 2
 *         for j <- i + 1 to n - 1
 *             for k <- j + 1 to n
 *                 sum <- sum + A[i] × A[j] × A[k]; # 코드1
 *     return sum;
 * }
 * </pre>
 */
public class p24267 {
    public static void main(String[] args) throws IOException {
        // 주어진 알고리즘의 수행 시간은 약 n^3임
        // 실제 수행 횟수는 !(!1 + ... + !(n - 2))
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long number = Long.parseLong(br.readLine());

        long count = solution(number);

        bw.write(String.valueOf(count));
        bw.newLine();
        bw.write("3");

        br.close();
        bw.flush();
        bw.close();
    }

    private static long solution(long n) {
        long sum = 0;
        long index = 1;
        long totalIndex = 0;

        while (index <= n - 2) {
            sum += index;
            ++index;
            totalIndex += sum;
        }

        return totalIndex;
    }
}
