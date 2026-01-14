package y2026.jan.d15;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.stream.Collectors;

public class p4 {
    public static void main(String[] args) {
        String[][] board = {{"O", "A", "C", "D", "E", "O"}, {"H", "O", "T", "C", "A", "P"}, {"P", "U", "S", "E", "T", "Z"}};
        String word = "OHOUSE";

        boolean result = solution(board, word);

        System.out.println(result);
    }

    private static boolean solution(String[][] board, String word) {
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        Deque<String> wordQueue = Arrays.stream(word.split("")).collect(Collectors.toCollection(ArrayDeque::new));

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                String target = wordQueue.peekFirst();
                if (board[i][j].equals(target)) {
                    wordQueue.poll();
                    if (traverse(board, wordQueue, i, j, directions)) {
                        return true;
                    }
                    wordQueue.addFirst(target);
                }
            }
        }

        return false;
    }

    private static boolean traverse(String[][] board, Deque<String> wordQueue, int x, int y, int[][] directions) {
        if (wordQueue.isEmpty()) {
            return true;
        }

        String word = wordQueue.peekFirst();

        for (int[] direction : directions) {
            int newX = x + direction[0];
            int newY = y + direction[1];

            if (newX >= 0 && newX < board.length && newY >= 0 && newY < board[0].length && board[newX][newY].equals(word)) {
                wordQueue.pollFirst();
                if (traverse(board, wordQueue, newX, newY, directions)) {
                    return true;
                }
                wordQueue.addFirst(word);
            }
        }

        return false;
    }
}
