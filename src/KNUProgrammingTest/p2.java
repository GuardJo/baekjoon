package KNUProgrammingTest;

import java.util.HashSet;
import java.util.Set;

/**
 * 100,000 x 100,000 크기의 공연장에서의 자리 착석여부에 의한 카운트
 * 자리 착석에 성공하면 +1
 */
public class p2 {
    public static void main(String[] args) {
        int[][] seat = 	{{1, 1}, {2, 1}, {1, 2}, {3, 4}, {2, 1}, {2, 1}};
        int result = solution(seat);

        System.out.println(result);
    }

    private static int solution(int[][] seat) {
        int answer = 0;
        Set<String> set = new HashSet<>();

        for (int i = 0; i < seat.length; i++) {
            String s = seat[i][0] + " " + seat[i][1];
            set.add(s);
        }
        answer = set.size();

        return answer;
    }
}
