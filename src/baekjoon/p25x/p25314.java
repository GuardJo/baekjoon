package baekjoon.p25x;

import java.io.*;

/**
 * <h1>코딩은 체육과목 입니다</h1>
 * <p>백준 문제</p>
 * <a href="https://www.acmicpc.net/problem/25314">문제 링크</a>
 */
public class p25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        String answer = solution(input);

        bw.write(answer);

        br.close();
        bw.flush();
        bw.close();
    }

    private static String solution(String input) {
        int n = Integer.parseInt(input) / 4;
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < n; i++) {
            answer.append("long ");
        }

        return answer.append("int").toString();
    }
}
