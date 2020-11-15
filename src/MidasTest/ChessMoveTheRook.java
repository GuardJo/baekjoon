package MidasTest;

public class ChessMoveTheRook {
    static int max = 0;
    public static void main(String[] args) {
        int[][] board = {{3, 6, 8}, {1, 4, 7}, {2, 1, 4}};
        int result = solution(board);

        System.out.println(result);
    }

    private static int solution(int[][] board) {
        int answer = 0;
        int rooks = board.length;
        int[][] setting = new int[board.length][board.length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                int sum = 0;
                rooks--;
                setBoolean(setting, i, j, 1);
                setRooks(setting, board, rooks, board[i][j], i, j);
                setBoolean(setting, i, j, -1);
                rooks++;
            }
        }
        answer = max;
        return answer;
    }

    private static void setBoolean(int[][] setting, int x, int y, int isSet) {
        for (int i = y; i < setting.length; i++) {
            setting[x][i] += isSet;
        }
        for (int i = y; i >= 0; i--) {
            setting[x][i] += isSet;
        }
        for (int i = x; i >= 0; i--) {
            setting[i][y] += isSet;
        }
        for (int i = x; i < setting.length; i++) {
            setting[i][y] += isSet;
        }
    }

    private static void setRooks(int[][] setting, int[][] board, int rooks, int sum, int x, int y) {
        if (rooks <= 0) {
            if (max < sum) {
                max = sum;
            }
            return;
        }
        for (int i = x; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (setting[i][j] == 0) {
                    sum += board[i][j];
                    rooks--;
                    setBoolean(setting, i, j, 1);
                    setRooks(setting, board, rooks, sum, i, j);
                    setBoolean(setting, i, j, -1);
                    rooks++;
                    sum -= board[i][j];
                }
            }
        }
    }
}
