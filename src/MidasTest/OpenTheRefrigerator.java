package MidasTest;

public class OpenTheRefrigerator {
    public static void main(String[] args) {
        int[] openA = {3, 5, 7};
        int[] closeB = {4, 10, 12};
        int result = solution(openA, closeB);

        System.out.println(result);
    }

    private static int solution(int[] openA, int[] closeB) {
        int answer = 0;
        int[] time = new int[closeB[closeB.length-1]+1];

        for (int i = 0; i < openA.length; i++) {
            time[openA[i]] = 1;
        }
        for (int i = 0; i < closeB.length; i++) {
            time[closeB[i]] = 2;
        }

        int openTime = 0;
        boolean isOpen = true;
        for (int i = openA[0]; i < time.length; i++) {
            if (time[i] == 1) {
                isOpen = true;
            }
            else if (time[i] == 2) {
                isOpen = false;
            }

            if (isOpen) {
                openTime++;
            }
            else {
                answer += openTime;
                openTime = 0;
            }

        }
        return answer;
    }
}
