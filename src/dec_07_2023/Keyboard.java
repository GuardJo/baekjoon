package dec_07_2023;

import java.util.Arrays;

public class Keyboard {
    public static void main(String[] args) {
        String number = "100";
        int result = solution(number);

        System.out.println(String.valueOf(result));
    }

    public static int solution(String number) {
        int answer = 0;
        int[] numbers = Arrays.stream(number.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] enterData = new int[numbers.length + 1];
        Arrays.fill(enterData, -1);

        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            int rightNum = (num + 1 > 9) ? 0 : num + 1;
            if (enterData[i] == -1) {
                enterData[i] = num;
                if (num != 0) {
                    enterData[i + 1] = rightNum;
                }
                ++answer;
            } else if (enterData[i] != num) {
                enterData[i] = num;
                if (num != 0) {
                    enterData[i + 1] = rightNum;
                }
                answer += 2;
            }
        }

        if (enterData[enterData.length - 1] != -1) {
            ++answer;
        }

        return answer;
    }
}
