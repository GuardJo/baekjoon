package baekjoon.p24x;

import java.io.*;

/**
 * <h1>알고리즘 수업 - 점근적 표기 1</h1>
 * <p>백준 문제</p>
 * <a href="https://www.acmicpc.net/problem/24313">문제 링크</a>
 */
public class p24313 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] a = br.readLine().split(" ");
        int c = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int result = solution(Integer.parseInt(a[0]), Integer.parseInt(a[1]), c, n);

        bw.write(String.valueOf(result));

        br.close();
        bw.flush();
        bw.close();
    }

    private static int solution(int a1, int a2, int c, int n) {
        int fx = (a1 * n) + a2;
        int gx = c * n;

        return (fx <= gx && a1 <= c) ? 1 : 0;
    }
}
