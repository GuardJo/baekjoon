package baekjoon.p15x;

import java.io.*;

/**
 * <h1>수학은 체육과목 입니다</h1>
 * <p>백준 문제</p>
 * <a href="https://www.acmicpc.net/problem/15894">문제 링크</a>
 */
public class p15894 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(solution(input)));

        br.close();
        bw.flush();
        bw.close();
    }

    private static long solution(int input) {
        return (input + input) * 2L;
    }
}
