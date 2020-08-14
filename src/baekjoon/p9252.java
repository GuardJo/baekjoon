package baekjoon;

import java.io.*;

public class p9252 {
    static char[] c1;
    static char[] c2;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        c1 = br.readLine().toCharArray();
        c2 = br.readLine().toCharArray();
        int[][] lcs = new int[c2.length+1][c1.length+1];
        int max = 0;

        for (int i = 1; i < lcs.length; i++) {
            char base = c2[i-1];
            for (int j = 1; j < lcs[0].length; j++) {
                char tmp = c1[j-1];
                if (base == tmp) {
                    lcs[i][j] = lcs[i-1][j-1] + 1;
                }
                else {
                    int up = lcs[i-1][j];
                    int left = lcs[i][j-1];
                    lcs[i][j] = Math.max(up, left);
                }

                if (lcs[i][j] > max) {
                    max = lcs[i][j];
                }
            }
        }

        bw.write(max + "\n");
        if (max > 0) {
            int x = c2.length;
            int y = c1.length;
            String result = getResult(lcs, x, y);
            bw.write(result + "");
            bw.write("\n");
        }



        br.close();
        bw.flush();
        bw.close();
    }

    private static String getResult(int[][] lcs, int x, int y) {
        if (x == 0 || y == 0) {
            return "";
        }
        else if (c2[x-1] == c1[y-1]) {
            return getResult(lcs, x-1, y-1) + c2[x-1];
        }
        else {
            if (lcs[x][y-1] > lcs[x-1][y]) {
                return getResult(lcs, x, y-1);
            }
            else {
                return getResult(lcs, x-1, y);
            }
        }
    }
}
