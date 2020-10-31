package Programmers_WinterCoding2020;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class p1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[][] delivery = {{5, 6, 0}, {1, 3, 1}, {1, 5, 0}, {7, 6, 0}, {3, 7, 1}, {2, 5, 0}};
        String result = solution(n, delivery);

        bw.write(result + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    private static String solution(int n, int[][] delivery) {
        String[] items = new String[n+1];
        String answer = "";

        for (int i = 0; i < items.length; i++) {
            items[i] = "?";
        }

        Arrays.sort(delivery, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[2] > o2[2]) {
                    return -1;
                }
                else if (o1[2] < o2[2]) {
                    return 1;
                }
                else {
                    return 0;
                }
            }
        });

        for (int i = 0; i < delivery.length; i++) {
            int x = delivery[i][0];
            int y = delivery[i][1];
            int deli = delivery[i][2];

            if (deli == 1) {
                items[x] = "o";
                items[y] = "o";
            }
            else {
                if (items[x].equals("o")) {
                    items[y] = "x";
                } else if (items[y].equals("o")) {
                    items[x] = "x";
                }
            }
        }
        for (int i = 1; i < items.length; i++) {
            answer += items[i];
        }
        return answer;
    }
}
