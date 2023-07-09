package july_09_2023;

public class FizzBuzz {
    public static void main(String[] args) {
        int n = 15;
        fizzBuzz(n);
    }

    public static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            printFizzBuzz(i);
        }
    }

    private static void printFizzBuzz(int n) {
        String fizz = "Fizz";
        String buzz = "Buzz";

        if (isMultipleOfFive(n) && isMultipleOfThree(n)) {
            System.out.println(fizz + buzz);
        } else if (isMultipleOfThree(n)) {
            System.out.println(fizz);
        } else if (isMultipleOfFive(n)) {
            System.out.println(buzz);
        } else {
            System.out.println(n);
        }
    }

    public static boolean isMultipleOfThree(int number) {
        return number % 3 == 0;
    }

    public static boolean isMultipleOfFive(int number) {
        return number % 5 == 0;
    }
}
