package dec_07_2023;

public class piramid {
    public static void main(String[] args) {
        int n = 10;
        int result = solution(n);

        System.out.println(String.valueOf(result));
    }

    public static int solution(int n) {
        int answer = 0;

        for (int i = n; i > 0; i--) {
            int base = i;
            int floor = maximunFloor(n - i) + 1;

            int max = base * floor;

            if (max > answer) {
                answer = max;
            }
        }

        return answer;
    }

    private static int maximunFloor(int n) {
        if (n <= 1) {
            return n;
        }

        int result = 0;
        int base = n;

        for (int i = 1; i < n; i++) {
            base -= i;

            if (base >= 0) {
                ++result;
            } else {
                break;
            }
        }

        return result;
    }
}
