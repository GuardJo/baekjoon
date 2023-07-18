package baekjoon.p10x;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

/**
 * <h1>팰린드롬인지 확인하기</h1>
 * <p>백준 문제</p>
 * <a href="https://www.acmicpc.net/problem/10988">문제 링크</a>
 */
public class p10988 {
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
        char[] chars = input.toCharArray();

        for (int i = 0; i < chars.length / 2; i++) {
            char left = chars[i];
            char right = chars[chars.length - 1- i];

            if (left != right) {
                return "0";
            }
        }

        return "1";
    }
}
