package july_08_2023;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class p1 {
    public static void main(String[] args) {
        String s = "1451232125";
        int n = 2;

        int answer = solution(s, n);

        System.out.println(answer);
    }

    public static int solution(String s, int N) {
        List<Integer> numbers = initNumbers(s, N);
        List<Integer> sortNumbers = filter(numbers, N);

        return sortNumbers.size() != 0 ? sortNumbers.get(0) : -1;
    }

    private static List<Integer> filter(List<Integer> numbers, int n) {
        List<Integer> list = new ArrayList<>();

        numbers.forEach((number) -> {
            if ((!hasDuplicateDigits(number)) && (!hasDigitsGreaterThan(number, n))) {
                list.add(number);
            }
        });

        list.sort(Collections.reverseOrder());

        return list;
    }

    private static List<Integer> initNumbers(String s, int n) {
        List<Integer> numbers = new ArrayList<>();
        String[] arr = s.split("");

        for (int i = 0; i < arr.length; i++) {
            try {
                StringBuilder numStr = new StringBuilder();
                for (int j = 0; j < n; j++) {
                    numStr.append(arr[j + i]);
                }

                numbers.add(Integer.parseInt(numStr.toString()));
            } catch (IndexOutOfBoundsException e) {
                break;
            }
        }

        return numbers;
    }

    private static boolean hasDuplicateDigits(int number) {
        String numberString = String.valueOf(number);
        boolean[] digits = new boolean[10];

        for (char digitChar : numberString.toCharArray()) {
            int digit = digitChar - '0';

            if (digits[digit]) {
                return true;
            }

            digits[digit] = true;
        }

        return false;
    }

    private static boolean hasDigitsGreaterThan(int number, int targetNumber) {
        String numberString = String.valueOf(number);

        for (char digitChar : numberString.toCharArray()) {
            int digit = digitChar - '0';

            if (digit > targetNumber) {
                return true;
            }
        }

        return false;
    }
}
