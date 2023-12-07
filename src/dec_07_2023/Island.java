package dec_07_2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Island {
    public static void main(String[] args) {
        String[] input = {"0000000111", "1110010110", "1110111000", "0000000111"};

        int result = solution(input);

        System.out.println(String.valueOf(result));
    }

    public static int solution(String[] maps) {
        int answer = 0;

        int ySize = maps[0].length();
        int xSize = maps.length;

        int[][] matrix = new int[xSize][ySize];

        for (int i = 0; i < matrix.length; i++) {
            String map = maps[i];
            matrix[i] = Arrays.stream(map.split(""))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][j] = 1;
                    int size = getMaxOnesInGroup(matrix);
                    if (size > answer) {
                        answer = size;
                    }
                    matrix[i][j] = 0;
                }
            }
        }

        return answer;
    }

    public static int getMaxOnesInGroup(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean[][] visited = new boolean[rows][cols];
        List<Integer> islands = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 1 && !visited[i][j]) {
                    int islandSize = dfs(matrix, visited, i, j);
                    islands.add(islandSize);
                }
            }
        }

        int maxOneIsland = 0;
        for (int n : islands) {
            maxOneIsland = Math.max(maxOneIsland, n);
        }

        return maxOneIsland;
    }

    private static int dfs(int[][] matrix, boolean[][] visited, int row, int col) {
        int count = 0;

        if (row < 0 || row >= matrix.length || col < 0 || col >= matrix[0].length || matrix[row][col] == 0 || visited[row][col]) {
            return 0;
        }

        visited[row][col] = true;
        count = 1;

        count += dfs(matrix, visited, row - 1, col); // 상
        count += dfs(matrix, visited, row + 1, col); // 하
        count += dfs(matrix, visited, row, col - 1); // 좌
        count += dfs(matrix, visited, row, col + 1); // 우

        return count;
    }
}
