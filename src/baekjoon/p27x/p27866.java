package baekjoon.p27x;

import java.io.*;

/**
 * <h1>문자와 문자열</h1>
 * <p>백준 문제</p>
 * <a href="https://www.acmicpc.net/problem/27866">문제 링크</a>
 */
public class p27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String target = br.readLine();
        int index = Integer.parseInt(br.readLine());

        bw.write(solution(target, index));

        br.close();
        bw.flush();
        bw.close();
    }

    private static String solution(String target, int index) {
        return target.substring(index - 1, index);
    }
}
