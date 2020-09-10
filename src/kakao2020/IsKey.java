package kakao2020;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;


public class IsKey {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[][] key = {{0, 0, 0}, {1, 0, 0}, {0, 1, 1}};
        int[][] lock = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};

        if (solution(key, lock)) {
            bw.write("true\n");
        } else {
            bw.write("false\n");
        }

        bw.flush();
        bw.close();
    }
    private static boolean solution(int[][] key, int[][] lock) {
        boolean answer = false;
        int rotateCount = 0;
        int lockCount = lock.length * lock[0].length;

        while (rotateCount < 4) {
            key = rotateKey(key);
            int baseSize = key.length;
            if (baseSize < key[0].length) {
                baseSize = key[0].length;
            }
            int[][] matrix = new int[lock.length + ((baseSize - 1) * 2)][lock[0].length + ((baseSize - 1) * 2)];
            int[][] matrix2 = new int[lock.length + ((baseSize - 1) * 2)][lock[0].length + ((baseSize - 1) * 2)];
            int centerX = key.length - 1;
            int centerY = key[0].length - 1;

            for (int i = 0; i < lock.length; i++) {
                for (int j = 0; j < lock[0].length; j++) {
                    matrix[centerX + i][centerY + j] += lock[i][j];
                    matrix2[centerX + i][centerY + j] += lock[i][j];
                }
            }
            for (int i = 0; i < matrix2.length - centerX; i++) {
                for (int j = 0; j < matrix2[0].length - centerY; j++) {
                    matrix2 = moveKey(i, j, matrix, key);
                    int count = 0;
                    for (int k = 0; k < lock.length; k++) {
                        for (int l = 0; l < lock[0].length; l++) {
                            if (matrix2[centerX + k][centerY + l] == 1) {
                                count++;
                            }
                        }
                    }
                    if (count == lockCount) {
                        answer = true;
                    }
                }
            }
            rotateCount++;
        }

        return answer;
    }

    private static int[][] moveKey(int x, int y, int[][] matrix, int[][] key) {
        int[][] addKey = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            System.arraycopy(matrix[i], 0, addKey[i], 0, matrix[0].length);
        }

        for (int i = 0; i < key.length; i++) {
            for (int j = 0; j < key[0].length; j++) {
                addKey[i + x][j + y] += key[i][j];
            }
        }

        return addKey;
    }

    private static int[][] rotateKey(int[][] key) {
        int[][] rotate = new int[key[0].length][key.length];

        for (int i = 0; i < key.length; i++) {
            for (int j = 0; j < key[0].length; j++) {
                rotate[rotate.length - 1 - j][i] = key[i][j];
            }
        }

        return rotate;
    }
}
