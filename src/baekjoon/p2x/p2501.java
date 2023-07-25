package baekjoon.p2x;

import java.io.*;

/**
 * <h1>약수 구하기</h1>
 * <p>백준 문제</p>
 * <a href="https://www.acmicpc.net/problem/2501">문제 링크</a>
 */
public class p2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");

        bw.write(String.valueOf(solution(Integer.parseInt(inputs[0]), Integer.parseInt(inputs[1]))));

        br.close();
        bw.flush();
        bw.close();
    }

    private static int solution(int n, int k) {
        int result = 0;
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }

            if (count == k) {
                result = i;
                break;
            }
        }

        return result;
    }
}
