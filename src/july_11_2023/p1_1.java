package july_11_2023;

import java.math.BigInteger;

public class p1_1 {
    public static void main(String[] args) {
        int n = 100000000;
        int result = solution(n);

        System.out.println(result);
    }

    public static int solution(int n) {
        int answer = -1;

        answer = getTailOfFactorial(BigInteger.valueOf(n));

        return answer;
    }

    private static int getTailOfFactorial(BigInteger number) {
        number = factorial(number);

        String[] arr = number.toString().split("");
        int result = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (!arr[i].equals("0")) {
                return result;
            }

            result++;
        }

        return result;
    }

    private static BigInteger factorial (BigInteger n) {
        if (n.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        }
        else {
            return n.multiply(factorial(n.subtract(BigInteger.ONE)));
        }
    }
}
