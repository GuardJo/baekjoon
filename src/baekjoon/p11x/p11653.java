package baekjoon.p11x;

import java.io.*;

/**
 * <h1>소인수분해</h1>
 * <p>백준 문제</p>
 * <a href="https://www.acmicpc.net/problem/11653>문제 링크</a>
 */
public class p11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());

        bw.write(solution(input));

        br.close();
        bw.flush();
        bw.close();
    }
    
    private static String solution(int num) {
        StringBuilder sb = new StringBuilder();
        int currentPrime = 2;

        if (num == 1) {
            return sb.toString();
        }

        while (!isPrime(num)) {
            if (num % currentPrime == 0) {
                num = num / currentPrime;
                sb.append(currentPrime).append("\n");
                currentPrime = 2;
            } else {
                while (!isPrime(++currentPrime)){}
            }
        }

        sb.append(num);

        return sb.toString();
    }

    private static boolean isPrime(int size) {
        for (int i = 2; i < size; i++) {
            if (size % i == 0) {
                return false;
            }
        }

        return true;
    }
}
