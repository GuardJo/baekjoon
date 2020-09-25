package NTS;


import java.util.LinkedList;
import java.util.Queue;

public class HandShake {
    public static void main(String[] args) {
        int N = 4;
        int result = solution(N);
        System.out.println(result);
    }

    private static int solution(int N) {
        int answer = 0;
        int size = (N * 2) + (N - 2);
        int size2 = size / 2;
        if (size2 == 0) {
            answer = 1;
        }
        answer = size2;

        return answer;
    }
}
