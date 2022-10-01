package SkillCheckTest.Level01;

/**
 * 프로그래머스 level 1
 * 약수의 개수와 덧셈
 */
public class NumberAndAdditionOfFactors {
    public static int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            if (isOddCountFactors(i)) {
                answer -= i;
            }
            else {
                answer += i;
            }
        }

        return answer;
    }

    private static boolean isOddCountFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if ((number % i) == 0) {
                count ++;
            }
        }

        return ((count % 2) == 1);
    }

    public static void main(String[] args) {
        int left = 13;
        int right = 17;
        int result = solution(left, right);

        System.out.println(result);
    }
}
