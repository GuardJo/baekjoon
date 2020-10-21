package SkillCheckTest.Level01;

import java.util.Stack;

public class SelectDoll {
    public static void main(String[] args) {
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
        int result = solution(board, moves);

        System.out.println(result);
    }

    private static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> doll = new Stack<>();

        for (int i = 0; i < moves.length; i++) {
            int select = selectDoll(board, moves[i]);
            if (select > 0) {
                if (doll.isEmpty()) {
                    doll.push(select);
                } else {
                    if (doll.peek() == select) {
                        answer += 2;
                        doll.pop();
                    } else {
                        doll.push(select);
                    }
                }
            }
        }

        return answer;
    }

    private static int selectDoll(int[][] board, int move) {
        int doll = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i][move-1] != 0) {
                doll = board[i][move-1];
                board[i][move-1] = 0;
                break;
            }
        }
        return doll;
    }
}
