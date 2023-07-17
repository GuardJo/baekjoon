package baekjoon.p2x;

import java.io.*;

/**
 * <h1>단어 길이 재기</h1>
 * <p>백준 문제</p>
 * <a href="https://www.acmicpc.net/problem/2743">문제 링크</a>
 */
public class p2743 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        bw.write(solution(input));

        br.close();
        bw.flush();
        bw.close();
    }

    private static String solution(String input) {
        return String.valueOf(input.length());
    }
}
