package baekjoon.p10x;

import java.io.*;

/**
 * <h1>??!</h1>
 * <p>백준 문제 : 10926번</p>
 * <a href="https://www.acmicpc.net/problem/10926">문제 링크</a>
 */
public class p10926 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String answer = solution(str);

        bw.write(answer);

        br.close();
        bw.flush();
        bw.close();
    }

    private static String solution(String str) {
        String postFix = "??!";

        return str + postFix;
    }
}
