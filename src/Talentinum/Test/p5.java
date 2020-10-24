package Talentinum.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class p5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> arr = new ArrayList<>();
        int size = Integer.parseInt(br.readLine());
        int[] test = {-5, 4, -2, 3, 1, -1, -6, -1, 0, 5};
        for (int i = 0; i < size; i++) {
            arr.add(test[i]);
        }
        int result = minX(arr);

        bw.write(result + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    private static int minX(List<Integer> arr) {
        int x = 1;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (i == 0) {
                sum = arr.get(i) + x;
            }
            else {
                sum += arr.get(i);
            }
            if (sum < 1) {
                x = Math.abs(sum) + 2;
                sum = 0;
                i = -1;
            }
        }
        return x;
    }
}
