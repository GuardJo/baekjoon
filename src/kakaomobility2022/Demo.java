package kakaomobility2022;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] test = {1, 2, 3};
        int result = new Demo().solution(test);

        System.out.println(result);
    }

    public int solution(int[] A) {
        Arrays.sort(A);
        int max = A[A.length - 1];
        int maxFirst = max;
        int result = 0;

        for (int i = A.length - 1; i >= 0; i--) {
            int num = A[i];

            if (num != max) {
                result = num + 1;
                break;
            }

            max--;
        }

        if (result < 0) {
            result = 1;
        }
        else if (result == 0) {
            result = maxFirst + 1;
        }

        return result;
    }
}
