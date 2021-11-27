package LineFinTech;

import java.util.ArrayList;
import java.util.List;

/**
 * A자 배열 찾기
 */
public class p2 {
    static int count = 0;
    public static int solution(int[] arr) {
        int answer = 0;
        List<int[]> list = new ArrayList<>();

        list.add(arr);

        for (int i = 3; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i + 1; j++) {
                int[] tmp = new int[i];
                for (int k = 0; k < tmp.length; k++) {
                    tmp[k] = arr[j + k];
                }
                list.add(tmp);
            }
        }

        list.forEach(numbers -> {
            if (checkA(numbers)) {
                count++;
            }
        });

        answer = count;

        return answer;
    }

    public static boolean checkA(int[] arr) {
        boolean check = false;

        for (int i = 1; i < arr.length - 1; i++) {
            boolean leftCheck = true;
            boolean rightCheck  = true;

            for (int j = 0; j < i; j++) {
                if (!(arr[j] < arr[j + 1])) {
                    leftCheck = false;
                    break;
                }
            }
            for (int j = i; j < arr.length - 1; j++) {
                if (!(arr[j] > arr[j + 1])) {
                    rightCheck = false;
                    break;
                }
            }

            if (leftCheck && rightCheck) {
                check = true;
                break;
            }
        }

        return check;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 1};

        int result = solution(arr);

        System.out.println(result);
    }
}
