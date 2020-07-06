package baekjoon;

import java.io.*;
import java.util.Arrays;

public class p5543 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] burgers = new int[3];
        int[] drinks = new int[2];

        for (int i = 0; i < burgers.length; i++) {
            burgers[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < drinks.length; i++) {
            drinks[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(burgers);
        Arrays.sort(drinks);
        int minValue = burgers[0] + drinks[0] - 50;
        bw.write(minValue + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
