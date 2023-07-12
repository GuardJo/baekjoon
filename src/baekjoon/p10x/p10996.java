package baekjoon.p10x;

import java.io.*;

public class p10996 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int number = Integer.parseInt(br.readLine());
        if (number < 2) {
            bw.write("*" + "\n");
        }
        else {
            for (int i = 0; i < number; i++) {
                for (int j = 0; j < number - (number / 2); j++) {
                    bw.write("* ");
                }
                bw.write("\n");
                for (int j = 0; j < number / 2; j++) {
                    bw.write(" *");
                }
                bw.write("\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
