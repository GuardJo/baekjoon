package toss;

public class handsomeNumber {
    public static void main(String[] args) {
        String s = "123";

        int result = findHandsomeNumber(s);

        System.out.println(result);
    }

    private static int findHandsomeNumber(String s) {
        int result = -1;

        String[] arr = s.split("");

        for (int i = 0; i < arr.length; i++) {
            if (isHandsome(arr, i)) {
                int number = Integer.parseInt(arr[i]);

                if (number > result) {
                    result = number;
                }
            }
        }

        if (result >= 0) {
            result *= 111;
        }

        return result;
    }

    private static boolean isHandsome(String[] arr, int index) {
        try {
            String left = arr[index - 1];
            String right = arr[index + 1];
            String center = arr[index];

            return left.equals(center) && center.equals(right);
        } catch (IndexOutOfBoundsException e) {
            return false;
        }
    }
}
