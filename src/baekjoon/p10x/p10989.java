package baekjoon.p10x;

import java.io.*;
import java.util.Arrays;

/**
 * <h1>수 정렬하기 3</h1>
 * <p>백준 문제</p>
 * <a href="https://www.acmicpc.net/problem/10989">문제 링크</a>
 */
public class p10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int inputSize = Integer.parseInt(br.readLine());
        int[] inputArr = new int[inputSize];

        for (int i = 0; i < inputSize; i++) {
            inputArr[i] = Integer.parseInt(br.readLine());
        }

        inputArr = Arrays.stream(inputArr).sorted()
                .toArray();

        for (int n : inputArr) {
            bw.write(n + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
