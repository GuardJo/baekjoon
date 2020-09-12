package kakao2020;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class BuildingPillar {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = 5;
        int[][] buildFrame = {{3, 0, 0, 1}, {3, 1, 0, 1}, {3, 1, 1, 1}, {3, 2, 1, 1}, {4, 1, 0, 1}, {4, 2, 1, 1}, {5, 0, 0, 1}, {5, 1, 0, 1}, {4, 1, 1, 1}, {3, 0, 0, 0}};

        int[][] result = solution(n, buildFrame);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                bw.write(result[i][j] + " ");
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }

    private static int[][] solution(int n, int[][] build_frame) {
        int[][] wall = new int[n + 1][n + 1];
        ArrayList<Index> list = new ArrayList<Index>();

        for (int i = 0; i < build_frame.length; i++) {
            int x = build_frame[i][0];
            int y = build_frame[i][1];
            int a = build_frame[i][2];
            int b = build_frame[i][3];
            if (b == 1) {
                if (a == 0) {
                    if (y == 0) {
                        list.add(new Index(x, y, a));
                        wall[x][y] += 1;
                        continue;
                    }
                    else {
                        if (x - 1 >= 0) {
                            if (wall[x - 1][y] > 1) {
                                list.add(new Index(x, y, a));
                                wall[x][y] += 1;
                                continue;
                            }
                        }
                        else if (y - 1 >= 0) {
                            if (wall[x][y - 1] > 0 || wall[x][y - 1] != 2) {
                                list.add(new Index(x, y, a));
                                wall[x][y] += 1;
                                continue;
                            }
                        }
                    }
                }
                else {
                    if (y - 1 != 0) {
                        if (wall[x][y - 1] > 0 && wall[x][y - 1] != 2) {
                            list.add(new Index(x, y, a));
                            wall[x][y] += 2;
                            continue;
                        }
                        if (x + 1 < wall.length) {
                            if (wall[x + 1][y - 1] > 0 && wall[x + 1][y - 1] != 2) {
                                list.add(new Index(x, y, a));
                                wall[x][y] += 2;
                                continue;
                            }
                        }
                    }
                }
            }
            else {

            }
        }
        return wall;
    }

    private static class Index {
        int x, y, a;
        private Index(int x, int y, int a) {
            this.x = x;
            this.y = y;
            this.a = a;
        }
    }
}
