package y2026.feb.d19;

import java.util.Arrays;

public class p1 {
    public static void main(String[] args) {
        int[] waiting = {1, 5, 8, 2, 10, 5, 4, 6, 4, 8};
        int[] result = solution(waiting);

        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(int[] waiting) {
        return Arrays.stream(waiting)
                .distinct()
                .toArray();
    }
}
