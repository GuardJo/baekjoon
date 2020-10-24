package Talentinum.Test;

import java.io.*;

public class p4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long n = Long.parseLong(br.readLine());
        int result = isPrime(n);

        bw.write(result + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    private static int isPrime(long n) {
        int answer = 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}
