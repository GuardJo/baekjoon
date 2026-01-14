package y2026.jan.d15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p1 {
    public static void main(String[] args) {
        String[][] arr = {{"W", "W", "B"}, {"W", "B", "W"}, {"B", "W", "W"}};

        int result = solution(arr);

        System.out.println(result);
    }

    private static int solution(String[][] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (hasInRows(arr, i)) {
                result++;
            }
        }

        return result;
    }

    private static boolean hasInRows(String[][] arr, int rowNum) {
        String[] rows = arr[rowNum];
        int bCount = 0;

        for (int i = 0; i < rows.length; i++) {
            String row = rows[i];
            if (bCount > 1) {
                return false;
            }
            if (row.equals("B")) {
                if (hasInColumns(arr, i)) {
                    bCount++;
                }
            }
        }

        return bCount == 1;
    }

    private static boolean hasInColumns(String[][] arr, int columnNum) {
        int bCount = 0;

        for (String[] strings : arr) {
            String column = strings[columnNum];

            if (column.equals("B")) {
                bCount++;
            }

            if (bCount > 1) {
                return false;
            }
        }

        return bCount == 1;
    }
}
