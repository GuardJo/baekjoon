package NHN_PreTest1;

import java.io.*;
import java.util.ArrayList;

public class p1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int matSize = Integer.parseInt(br.readLine());
        int[][] mat = new int[matSize][matSize];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < matSize; i++) {
            String[] str = br.readLine().split(" ");
            for (int j = 0; j < matSize; j++) {
                mat[i][j] = Integer.parseInt(str[j]);
            }
        }

        for(int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] == 1) {
                    mat[i][j] = 0;
                    list.add(searchPlace(mat, i, j, 1));
                }
            }
        }

        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        br.close();
        bw.flush();
        bw.close();
    }

    private static Integer searchPlace(int[][] mat, int x, int y, int count) {
        int[][] direction = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        for (int i = 0; i < direction.length; i++) {
            int indexX = x + direction[i][0];
            int indexY = y + direction[i][1];
            if (indexX >= 0 && indexX < mat.length && indexY >= 0 && indexY < mat.length) {
                if (mat[indexX][indexY] == 1) {
                    mat[indexX][indexY] = 0;
                    count++;
                    count = searchPlace(mat, indexX, indexY, count);
                }
            }
        }
        return count;
    }
}
