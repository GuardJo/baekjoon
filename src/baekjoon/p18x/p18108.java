package baekjoon.p18x;

import java.io.*;

/**
 * <h1>1998년생인 내가 태국에서는 2541년생?!</h1>
 * <p>백준 문제 : 18108번</p>
 * <a href="https://www.acmicpc.net/problem/18108">문제 링크</a>
 */
public class p18108 {
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

    private static String solution(String buddaYear) {
        int budda = 543;
        int answer = Integer.parseInt(buddaYear) - budda;

        return String.valueOf(answer);
    }
}
