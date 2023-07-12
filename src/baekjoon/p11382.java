package baekjoon;

import java.io.*;

/**
 * <h1>꼬마 정민</h1>
 * <p>백준 문제 : 11382번</p>
 * <a href="https://www.acmicpc.net/problem/11382">문제 링크</a>
 */
public class p11382 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        String output = solution(input);

        bw.write(output);

        br.close();
        bw.flush();
        bw.close();
    }

    private static String solution(String str) {
        String[] arr = str.split(" ");
        long answer = 0;

        for (String s : arr) {
            answer += Long.parseLong(s);
        }

        return String.valueOf(answer);
    }
}
