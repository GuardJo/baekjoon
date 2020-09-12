package kakao2021;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CardGame {
    public static void main(String[] args) {
        int[][] board = {{1, 0, 0, 3}, {2, 0, 0, 0}, {0, 0, 0, 2}, {3, 0, 1, 0}};
        int r = 1;
        int c = 0;
        int result = solution(board, r, c);
    }

    private static int solution(int[][] board, int r, int c) {
        int answer = 0;
        int[][] direction = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        boolean isEnter = false;
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> qx = new LinkedList<>();
        Queue<Integer> qy = new LinkedList<>();
        qx.offer(r);
        qy.offer(c);
        while (!qx.isEmpty()) {
            int baseX = qx.poll();
            int baseY = qy.poll();
            if (board[baseX][baseY] > 0) {

            }
        }

        return answer;
    }
}
