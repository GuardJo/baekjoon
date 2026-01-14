package y2026.jan.d15;

import java.util.Arrays;

public class p2 {
    public static void main(String[] args) {
        int[] numbers = {2, 2, 0, 3};

        int[] result = solution(numbers);

        System.out.println(Arrays.toString(result));
    }

    private static int[] solution(int[] numbers) {
        String[] numberStrArr = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);

        String numberStr = String.join("", numberStrArr);

        long number = Long.parseLong(numberStr);

        number++;

        return sepherateNumber(number);
    }

    private static int[] sepherateNumber(long number) {
        String numberToStr = String.valueOf(number);
        String[] numberToStrArr = numberToStr.split("");

        return Arrays.stream(numberToStrArr)
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
