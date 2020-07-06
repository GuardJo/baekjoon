package baekjoon;

import java.io.*;

public class p2446 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int number = Integer.parseInt(br.readLine());

        for (int i = 0; i < (number * 2) - 1; i++) {
            if (i < number) {
                for (int j = 0; j < i; j++) {
                    bw.write(" ");
                }
                for (int j = (number * 2) - 1 - i; j > i; j--) {
                    bw.write("*");
                }
            }
            else {
                for (int j = i; j < (number * 2) - 2; j++) {
                    bw.write(" ");
                }
                for (int j = 0; j < 3 + ((i - number) * 2); j++) {
                    bw.write("*");
                }
            }
            bw.write("\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
