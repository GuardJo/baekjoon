package y2026.jan.d15;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        int[][] v = {{1, 4}, {3, 4}, {3, 10}};

        int[] result = solution(v);

        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] solution(int[][] v) {
        int[] answer = new int[2];

        List<Integer> xArr = new ArrayList<>();
        List<Integer> yArr = new ArrayList<>();

        for (int[] val : v) {
            int x = val[0];
            int y = val[1];

            if (!xArr.contains(x)) {
                xArr.add(x);
            } else {
                xArr.remove((Integer) x);
            }

            if (!yArr.contains(y)) {
                yArr.add(y);
            } else {
                yArr.remove((Integer) y);
            }
        }

        answer[0] = xArr.get(0);
        answer[1] = yArr.get(0);

        return answer;
    }
}
