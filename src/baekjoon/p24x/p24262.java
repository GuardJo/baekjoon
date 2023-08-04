package baekjoon.p24x;

import java.io.*;

/**
 * <h1>알고리즘 수업 - 알고리즘의 수행 시간 1</h1>
 * <p>백준 문제</p>
 * <a href="https://www.acmicpc.net/problem/24262">문제 링크</a>
 * <hr>
 * <p>주어진 알고리즘</p>
 * <pre>
 * MenOfPassion(A[], n) {
 *     i = ⌊n / 2⌋;
 *     return A[i]; # 코드1
 * }
 * </pre>
 */
public class p24262 {
    public static void main(String[] args) throws IOException {
        // 문제에서 제공한 코드는 무조건 한번 수행되는 코드이기에 수행횟수는 1로 수렴한다
        // 또한 1의 최고차항은 0으로 수렴

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        br.readLine();

        bw.write("1");
        bw.newLine();
        bw.write("0");

        br.close();
        bw.flush();
        bw.close();
    }
}
