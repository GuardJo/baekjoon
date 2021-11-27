package LineFinTech;

/**
 * 직사각형 이동 (미완)
 */
public class p4 {
    public static String[] solution(int[][] rectangles) {
        String[] answer = new String[rectangles.length];
        int[][] matrix = new int[11][11];

        for (int i = 0; i < rectangles.length; i++) {
            setDown(matrix, rectangles[i]);
        }

        for (int i = 0; i < rectangles.length; i++) {
            down(matrix, rectangles[i]);
        }

        for (int[] mat : matrix) {
            for (int m : mat) {
                System.out.print(m + " ");
            }
            System.out.println();
        }

        return answer;
    }

    private static void setDown(int[][] matrix, int[] rectangle) {
        int x1 = rectangle[0];
        int x2 = rectangle[2];

        for (int i = x1; i < x2; i++) {
            matrix[i][rectangle[1]]++;
        }
    }

    private static void down(int[][] matrix, int[] rectangle) {
        int x1 = rectangle[0];
        int x2 = rectangle[2];
        int count = 0;

    }

    private static boolean checkX(int[] matrix, int x, int y) {
        boolean result = false;

        return result;
    }

    public static void main(String[] args) {
        int[][] rectangles = {{0, 2, 1, 3}, {1, 2, 2, 5}, {3, 3, 4, 4}, {4, 1, 6, 3}, {1, 6, 5, 7}, {5, 5, 7, 6}, {5, 8, 6, 10}};
        String[] result = solution(rectangles);

        for (String str : result) {
            System.out.println(str);
        }
    }
}
