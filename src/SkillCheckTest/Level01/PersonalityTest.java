package SkillCheckTest.Level01;

import java.util.HashMap;
import java.util.Map;

/**
 * 프로그래머스 level 1
 * 성격 유형 검사하기
 */
public class PersonalityTest {
    public static void main(String[] args) {
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};
        String result = new Solution().solution(survey, choices);

        System.out.println(result);
    }

    private static class Solution {
        public String solution(String[] survey, int[] choices) {
            String[][] types = {{"R", "T"}, {"C", "F"}, {"J", "M"}, {"A", "N"}};
            Map<String, Integer> map = new HashMap<>();
            String answer = "";

            for (String[] type : types) {
                map.put(type[0], 0);
                map.put(type[1], 0);
            }

            for (int i = 0; i < survey.length; i++) {
                int score = choices[i];
                String key = survey[i].split("")[0];
                if (score > 4) {
                    score -= 4;
                    key = survey[i].split("")[1];
                }
                else if (score < 4) {
                    score -= 4;
                    score = Math.abs(score);
                    key = survey[i].split("")[0];
                }
                else {
                    score = 0;
                }

                map.replace(key, map.get(key) + score);
            }

            for (String[] type : types) {
                int aScore = map.get(type[0]);
                int bScore = map.get(type[1]);

                if (aScore < bScore) {
                    answer += type[1];
                }
                else {
                    answer += type[0];
                }
            }

            return answer;
        }
    }
}
