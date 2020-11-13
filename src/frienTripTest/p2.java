package frienTripTest;

import java.io.*;

public class p2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        String[] str = s.split(" ");
        int n = Integer.parseInt(str[0]);
        int r = Integer.parseInt(str[1]);
        int c = Integer.parseInt(str[2]);
        long result = solution(n, r, c);

        bw.write(result + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    private static long solution(int n, int r, int c) {
        long answer = 2;
        int[][] downDirection = {{1, -1}, {1, 0}, {1, 1}, {0, 1}, {-1, 1}};
        int[][] upDirection = {{-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}};
        boolean isDown = true;
        int[][] direction = downDirection;
        int x = 0;
        int y = 1;

        for (int i = 0; i < direction.length; i++) {
            int nextX = x + direction[i][0];
            int nextY = y + direction[i][1];
            if (nextX >= 0 && nextX < n && nextY >= 0 && nextY < n) {
                if (Math.abs(x - nextX) + Math.abs(y - nextY) == 1) {
                    if (isDown) {
                        isDown = false;
                        direction = upDirection;
                    } else {
                        isDown = true;
                        direction = downDirection;
                    }
                }
                x = nextX;
                y = nextY;
                i = -1;
                answer++;
                if (x == (r-1) && y == (c-1)) {
                    return answer;
                }
            }
        }
        return answer;
    }
}
