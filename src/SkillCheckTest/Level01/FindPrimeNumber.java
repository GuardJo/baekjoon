package SkillCheckTest.Level01;

public class FindPrimeNumber {
    public static void main(String[] args) {
        int n = 5;
        int result = solution(n);

        System.out.println(result);
    }

    private static int solution(int n) {
        int answer = 0;

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                answer++;
            }
        }
        return answer;
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
