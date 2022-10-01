package bucketPlace;

import java.util.Arrays;

public class p2 {
    public static void main(String[] args) {
        int[] numbers = {-1,6,0,2,9,-8};
        int[] result = solution(numbers);

        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] solution(int[] numbers) {
        int[] sortArr = numbers;
        int[] answer = new int[sortArr.length];
        int head = 0;
        int tail = answer.length - 1;
        Arrays.sort(sortArr);

        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == 0) {
                if (i == 0 || i % 2 == 0) {
                    answer[i] = sortArr[tail--];
                }
                else {
                    answer[i] = sortArr[head++];
                }
            }
        }

        return answer;
    }
}
