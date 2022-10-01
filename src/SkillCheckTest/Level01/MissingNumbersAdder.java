package SkillCheckTest.Level01;

/**
 * 프로그래머스 level 1
 * 없는 숫자 더하기
 */
public class MissingNumbersAdder {
    public static int solution(int[] numbers) {
        int answer = 0;
        int addAllNumberZeroToNine = 45; // 0부터 9까지 더한 수

        for (int number : numbers) {
            answer += number;
        }

        answer = addAllNumberZeroToNine - answer;

        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0};
        int result = solution(numbers);

        System.out.println(result);
    }
}
