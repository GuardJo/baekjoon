package Talentinum.Test;

import java.io.*;

public class p6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int result = countPerms(n);

        bw.write(result + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    private static int countPerms(int n) {
        int answer = 0;

        return answer;
    }
}
