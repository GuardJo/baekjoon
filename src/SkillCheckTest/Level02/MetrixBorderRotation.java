package SkillCheckTest.Level02;

import java.util.Arrays;

/**
 * <h1>행렬 테두리 회전하기</h1>
 * <p>프로그래머스 문제</p>
 * <a href=https://school.programmers.co.kr/learn/courses/30/lessons/77485?language=java>링크</a>
 */
public class MetrixBorderRotation {
    public static void main(String[] args) {
        int rows = 6;
        int columns = 6;
        int[][] queries = {{2,2,5,4},{3,3,6,6},{5,1,6,3}};

        int[] result = solution(rows, columns, queries);

        Arrays.stream(result).forEach(System.out::println);
    }

    public static int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        int[][] metrix = initMetrix(rows, columns);
        int answerIndex = 0;

        for (int[] query : queries) {
            int min = rotate(metrix, query[0] - 1, query[1] - 1, query[2] - 1, query[3] - 1);

            answer[answerIndex++] = min;
        }

        return answer;
    }

    private static int rotate(int[][] metrix, int x1, int y1, int x2, int y2) {
        int xLength = x2 - x1;
        int yLength = y2 - y1;
        int minNumber = Integer.MAX_VALUE;

        int[] currentIndexes = {x1, y1};
        int current = metrix[currentIndexes[0]][currentIndexes[1]];

        int[][] directions = {{0, 1, yLength}, {1, 0, xLength}, {0, -1, yLength}, {-1, 0, xLength}};

        for (int[] direction : directions) {
            for (int i = 0; i < direction[2]; i++) {
                int nextX = currentIndexes[0] + direction[0];
                int nextY = currentIndexes[1] + direction[1];

                if (current < minNumber) {
                    minNumber = current;
                }

                int tmp = metrix[nextX][nextY];
                metrix[nextX][nextY] = current;
                current = tmp;
                currentIndexes[0] = nextX;
                currentIndexes[1] = nextY;
            }
        }

        return minNumber;
    }

    private static int[][] initMetrix(int rows, int columns) {
        int[][] metrix = new int[rows][columns];

        int number = 1;

        for (int i = 0; i < metrix.length; i++) {
            for (int j = 0; j < metrix[i].length; j++) {
                metrix[i][j] = number++;
            }
        }

        return metrix;
    }
}
