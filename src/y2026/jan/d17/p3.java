package y2026.jan.d17;

import java.util.ArrayList;
import java.util.List;

public class p3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5000; i++) {
            System.out.println(i + " : " + solution(i));
        }
    }

    private static int solution(int n) {
        int len = 1;
        long count = 9;
        int start = 1;

        while (n > len * count) {
            n -= len * count;
            len += 1;
            count *= 10;
            start *= 10;
        }

        start += (n - 1) / len;
        String s = String.valueOf(start);
        return Character.getNumericValue(s.charAt((n - 1) % len));

    }
}
