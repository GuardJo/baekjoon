package NTS;

public class histogram {
    public static void main(String[] args) {
        int[] histogram = {6, 5, 7, 3, 4, 2};
        int result = solution(histogram);
        System.out.println(result);
    }

    private static int solution(int[] histogram) {
        int answer = 0;

        for (int i = 0; i < histogram.length-1; i++) {
            int start = histogram[i];
            for (int j = i+1; j < histogram.length; j++) {
                int end = histogram[j];
                int x = j - i - 1;
                int y = Math.min(start, end);
                int mul = x * y;
                if (mul > answer) {
                    answer = mul;
                }
            }
        }
        return answer;
    }
}
