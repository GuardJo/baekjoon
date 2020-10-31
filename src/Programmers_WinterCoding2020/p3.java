package Programmers_WinterCoding2020;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class p3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[][] v = {{0, 0, 1}, {2, 2, 1}, {0, 0, 0}};
        int[] result = solution(v);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        br.close();
        bw.flush();
        bw.close();
    }

    private static int[] solution(int[][] v) {
        int[] answer = {0, 0, 0};

        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[0].length; j++) {
                if (v[i][j] == 0) {
                    answer[0]++;
                }
                else if(v[i][j] == 1) {
                    answer[1]++;
                }
                else if (v[i][j] == 2) {
                    answer[2]++;
                }

                if (v[i][j] != -1) {
                    findArea(v, i, j, v[i][j]);
                }
            }
        }
        return answer;
    }

    private static void findArea(int[][] v, int x, int y, int num) {
        Queue<Index> q = new LinkedList<>();
        q.offer(new Index(x, y));
        int[][] direction = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        while (!q.isEmpty()) {
            Index tmp = q.poll();
            int baseX = tmp.x;
            int baseY = tmp.y;
            v[baseX][baseY] = -1;
            for (int i = 0; i < direction.length; i++) {
                int indexX = baseX + direction[i][0];
                int indexY = baseY + direction[i][1];
                if (indexX >= 0 && indexX < v.length && indexY >= 0 && indexY < v.length) {
                    if (v[indexX][indexY] == num) {
                        q.offer(new Index(indexX, indexY));
                    }
                }
            }
        }
    }
    private static class Index {
        int x;
        int y;
        public Index(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
