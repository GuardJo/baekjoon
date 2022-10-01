package SkillCheckTest.Level01;

/**
 * 프로그래머스 level 1
 * 신규 아이디 추천
 */
public class NewIdGenerator {
    public static void main(String[] args) {
        String new_id = "...!@BaT#*..y.abcdefghijklm";
        String result = new Solution().solution(new_id);

        System.out.println(result);
    }

    private static class Solution {
        public String solution(String new_id) {
            String answer = "";

            answer = new_id.toLowerCase();
            answer = answer.replaceAll("[^\\w\\-\\.]", "");
            answer = answer.replaceAll("[\\.]{2,}", ".");
            answer = answer.replaceAll("^\\.|\\.$", "");

            if (answer.length() == 0) {
                answer = "a";
            }
            if (answer.length() > 15) {
                answer = answer.substring(0, 15);
                answer = answer.replaceAll("\\.$", "");
            }
            if (answer.length() < 3) {
                String str = answer.substring(answer.length() - 1);
                while (answer.length() < 3) {
                    answer += str;
                }
            }

            return answer;
        }
    }
}
