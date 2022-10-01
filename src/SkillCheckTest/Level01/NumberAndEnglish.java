package SkillCheckTest.Level01;

/**
 * 프로그래머스 level 1
 * 숫자 문자열과 영단어
 */
public class NumberAndEnglish {
    private static Solution solution = new Solution();

    public static void main(String[] args) {
        String s = "one4seveneight";
        int result = solution.solution(s);

        System.out.println(result);
    }

    private static class Solution {
        public int solution(String s) {
            int answer = 0;
            String[] englishes = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

            for (int i = 0; i < englishes.length; i++) {
                s = s.replace(englishes[i], Integer.toString(i));
            }

            answer = Integer.parseInt(s);

            return answer;
        }
    }
}
