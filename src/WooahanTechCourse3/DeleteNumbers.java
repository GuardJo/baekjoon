package WooahanTechCourse3;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class DeleteNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = 3;
        int[][] board = {{3, 5, 6}, {9, 2, 7}, {4, 1, 8}};
        int result = solution(n, board);

        bw.write(result + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    private static int solution(int n, int[][] board) {
        int answer = 0;
        int maxNum = (int) Math.pow(n, 2);
        Node index = new Node(0, 0, 0);

        for (int i = 1; i <= maxNum; i++) {
            int x = index.x;
            int y = index.y;
            index = searchMin(x, y, i, board);
            answer += index.min;
        }
        answer += maxNum;
        return answer;
    }

    private static Node searchMin(int x, int y, int num, int[][] board) {
        Queue<Node> q = new LinkedList<>();
        int[][] mins = new int[board.length][board[0].length];
        int[][] direction = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int nextX = -1;
        int nextY = -1;
        q.offer(new Node(x, y, 0));

        while(!q.isEmpty()) {
            Node base = q.poll();
            int baseX = base.x;
            int baseY = base.y;
            int distance = ++base.min;
            for (int i = 0; i < direction.length; i++) {
                int indexX = baseX + direction[i][0];
                int indexY = baseY + direction[i][1];
                if (indexX > board.length-1) {
                    indexX = 0;
                }
                if (indexX < 0) {
                    indexX = board.length-1;
                }
                if (indexY > board.length-1) {
                    indexY = 0;
                }
                if (indexY < 0) {
                    indexY = board.length-1;
                }
                if (mins[indexX][indexY] == 0 || mins[indexX][indexY] > distance) {
                    mins[indexX][indexY] = distance;
                    q.add(new Node(indexX, indexY, distance));
                }
                if (board[indexX][indexY] == num) {
                    nextX = indexX;
                    nextY = indexY;
                }
            }
        }

        return new Node(nextX, nextY, mins[nextX][nextY]);
    }

    static class Node {
        int x;
        int y;
        int min;
        public Node(int x, int y, int min) {
            this.x = x;
            this.y = y;
            this.min = min;
        }
    }
}
