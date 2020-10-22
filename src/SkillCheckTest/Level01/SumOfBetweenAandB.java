package SkillCheckTest.Level01;

public class SumOfBetweenAandB {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        long result = solution(a, b);

        System.out.println(result);
    }

    private static long solution(int a, int b) {
        long answer = 0;
        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }

        while (a <= b) {
            answer += a;
            a++;
        }
        return answer;
    }
}
