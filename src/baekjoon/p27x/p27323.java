package baekjoon.p27x;

import java.io.*;

/**
 * <h1>직사각형</h1>
 * <p>백준 문제</p>
 * <a href="https://www.acmicpc.net/problem/27323">문제 링크</a>
 */
public class p27323 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(x * y));

        br.close();
        bw.flush();
        bw.close();
    }
}
