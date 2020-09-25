package NTS;

import java.util.LinkedList;
import java.util.Queue;

public class SearchTree {
    public static void main(String[] args) {
        int[][] t1 = {{1, 2}, {3, 4}, {5, 6}, {-1, 7}, {8, 9}, {-1, -1}, {-1, -1}, {-1, -1}, {-1, -1}, {-1, -1}};
        int[][] t2 = {{1, 2}, {-1, -1}, {-1, -1}};
        int result = solution(t1, t2);

        System.out.println(result);
    }

    private static int solution(int[][] t1, int[][] t2) {
        int answer = 0;
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        for (int i = 0; i < t1.length; i++) {
            int left = t1[i][0];
            int right = t1[i][1];
            for (int j = 0; j < t2.length; j++) {
                int left2 = t2[j][0];
                int right2 = t2[j][1];
                if (left == left2 && right == right2) {

                }
            }
        }
        return answer;
    }
}
