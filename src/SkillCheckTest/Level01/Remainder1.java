package SkillCheckTest.Level01;

/**
 * 프로그래머스 level 1
 * 나머지가 1이 되는 수 찾기
 */
public class Remainder1 {
    public static int solution(int n) {
        int answer = 0;

        while (true) {
            ++answer;
            if ((n % answer) == 1) {
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 12;
        int result = solution(n);

        System.out.println(result);
    }
}
