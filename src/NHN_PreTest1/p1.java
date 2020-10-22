package NHN_PreTest1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class p1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sizeOfMatrix = Integer.parseInt(br.readLine());
        int[][] matrix = new int[sizeOfMatrix][sizeOfMatrix];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < sizeOfMatrix; i++) {
            String[] str = br.readLine().split(" ");
            for (int j = 0; j < sizeOfMatrix; j++) {
                matrix[i][j] = Integer.parseInt(str[j]);
            }
        }

        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 1) {
                    matrix[i][j] = 0;
                    list.add(searchPlace(matrix, i, j, 1));
                }
            }
        }

        System.out.println(list.size());
        Collections.sort(list);
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
