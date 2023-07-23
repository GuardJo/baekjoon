package baekjoon.p2x;

import java.io.*;

/**
 * <h1>중앙 이동 알고리즘</h1>
 * <p>백준 문제</p>
 * <a href="https://www.acmicpc.net/problem/2903">문제 링크</a>
 */
public class p2903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(solution(num)));

        br.close();
        bw.flush();
        bw.close();
    }

    private static int solution(int num) {
        int[] base = initBaseArray();

        return (int) Math.pow(base[num], 2);
    }

    private static int[] initBaseArray() {
        int[] base = new int[16];

        base[0] = 2;

        for (int i = 1; i < base.length; i++) {
            int lastNum = base[i - 1];
            base[i] = (lastNum * 2) - 1;
        }

        return base;
    }
}
