package july_11_2023;

public class p2 {
    public static void main(String[] args) {
        int n = 10;
        int result = solution(n);

        System.out.println(result);
    }

    public static int solution(int n) {
        int answer = -1;

        if (n < 10) {
            return n;
        }

        long x = 9;
        long y = 1;
        long total = 9;

        while (n >= (x * 10) * (y + 1)) {
            x *= 10;
            y += 1;
            total += x * y;
        }

        n -= (total + 1);
        String s = String.valueOf((int) Math.pow(10, y) + n / (y + 1));
        answer = s.charAt(n % ((int) y + 1)) - '0';

        return answer;
    }
}
