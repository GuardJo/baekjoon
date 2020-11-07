package WooahanTechCourse3;

public class RobotCleaner {
    public static void main(String[] args) {
        int n = 100;
        boolean horizontal = true;
        int[][] result = solution(n, horizontal);

        for(int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] solution(int n, boolean horizontal) {
        int[][] answer = new int[n][n];
        int[][] rightDirection = {{1, -1}, {1, 0}, {1, 1}, {0, 1}, {-1, 1}};
        int[][] downDirection = {{-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}};
        int[][] direction;
        int x = 0;
        int y = 0;
        int count = 0;

        if (horizontal) {
            direction = rightDirection;
            y++;
        }
        else {
            direction = downDirection;
            x++;
        }
        answer[x][y] = 1;
        count++;

        for (int i = 0; i < direction.length; i++) {
            int nextX = x + direction[i][0];
            int nextY = y + direction[i][1];
            if (nextX >= 0 && nextX < answer.length && nextY >= 0 && nextY < answer.length) {
                x = nextX;
                y = nextY;
                int distance = Math.abs(direction[i][0]) + Math.abs(direction[i][1]);
                count += distance;
                answer[x][y] = count;

                if (distance == 1) {
                    if (horizontal) {
                        horizontal = false;
                        direction = downDirection;
                    }
                    else {
                        horizontal = true;
                        direction = rightDirection;
                    }
                }
                i = -1;
            }
        }


        return answer;
    }
}
