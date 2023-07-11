package july_11_2023;

public class p2_1 {
    public static void main(String[] args) {
        int n = 21;
        int result = solution(n);

        System.out.println(result);
    }

    public static int solution(int n) {
        int answer = -1;
        int count = 0;
        int index = 1;
        while (count < n) {
            String str = String.valueOf(index++);
            count += str.length();

            if (count >= n) {
                int distance = Math.abs((count - n));
                return check(str, distance);
            }
        }

        return answer;
    }

    private static int check(String numStr, int index) {
        String[] arr = numStr.split("");

        return Integer.parseInt(arr[arr.length - 1 - index]);
    }
}
