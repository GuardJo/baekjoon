package SkillCheckTest.Level01;

public class AverageOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        double result = solution(arr);

        System.out.println(result);
    }

    private static double solution(int[] arr) {
        double answer = 0;
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        answer = sum / arr.length;

        return answer;
    }
}
