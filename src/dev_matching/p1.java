package dev_matching;

import java.util.Arrays;

/**
 * 아이디 추천
 */
public class p1 {
    private static class Solution {
        public String solution(String[] registered_list, String new_id) {
            String answer = "";

            if (Arrays.binarySearch(registered_list, new_id) == -1) {
                return new_id;
            }

            String typeS = new_id.replaceAll("[a-z]{3,6}", "");

            return answer;
        }
    }

    public static void main(String[] args) {
        String[] registered_list = {"card", "ace13", "ace16", "banker", "ace17", "ace14"};
        String new_id = "ace15";
        String result = new Solution().solution(registered_list, new_id);

        System.out.println(result);
    }
}
