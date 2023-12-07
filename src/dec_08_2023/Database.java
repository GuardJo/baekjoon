package dec_08_2023;

public class Database {
    public static void main(String[] args) {
        int n = 14;
        int m = 2;
        int[][] feature = {{5, 1}, {2, 7}, {1, 14}};

        System.out.println(solution(n, m, feature));
    }

    public static int solution(int n, int m, int[][] features) {
        int answer = Integer.MAX_VALUE;

        for (int[] feat : features) {
            int time = (n * feat[0]) + (m * feat[1]);

            if (time < answer) {
                answer = time;
            }
        }

        return answer;
    }
}
