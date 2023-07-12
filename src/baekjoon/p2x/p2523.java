package baekjoon.p2x;

import java.io.*;

public class p2523 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int number = Integer.parseInt(br.readLine());

        int count = 1;
        int tmp = 1;
        boolean top = false;
        while (count > 0) {
            for (int i = 0; i < count; i++) {
                bw.write("*");
            }
            bw.write("\n");
            if (count >= number) {
                top = true;
            }
            if (top) {
                count--;
            }
            else {
                count++;
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
