package baekjoon.p10x;

import java.io.*;

/**
 * <h1>삼각형 외우기</h1>
 * <p>백준 문제</p>
 * <a href="https://www.acmicpc.net/problem/10101">문제 링크</a>
 */
public class p10101 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int inputSize = 3;
        int[] inputs = new int[inputSize];

        for (int i = 0; i < inputSize; i++) {
            inputs[i] = Integer.parseInt(br.readLine());
        }

        bw.write(solution(inputs));

        br.close();
        bw.flush();
        bw.close();
    }

    private static String solution(int[] inputs) {
        int x = inputs[0];
        int y = inputs[1];
        int z = inputs[2];

        if (x == 60 && y == 60 && z == 60) {
            return "Equilateral";
        }

        if (x + y + z == 180) {
            if (x == y || y == z || z == x) {
                return "Isosceles";
            }
            return "Scalene";
        } else {
            return "Error";
        }
    }
}
