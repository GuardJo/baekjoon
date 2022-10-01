package uplus;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 문자열 압축
 */
public class p2 {
    private static class Solution {
        public String solution(String compressed) {
            String answer = "";
            Map<String, String> map = new LinkedHashMap<>();

            char[] compresseds = compressed.toCharArray();

            for (int i = 0; i < compresseds.length; i++) {
                if (Character.isDigit(compresseds[i])) {
                    String num = "";
                    num += compresseds[i];
                    int j = i + 1;
                    while (Character.isDigit(compresseds[j])) {
                        num += compresseds[j++];
                    }
                    setSubString(compressed.substring(j), num, map);
                    i = j;
                }
            }

            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                compressed = compressed.replace(key, value);
            }

            answer = compressed;

            return answer;
        }

        public void setSubString(String str, String number, Map<String, String> map) {
            String result = "";
            int checkCount = 1;

            char[] chars = str.toCharArray();

            for (int i = 1; i < chars.length; i++) {
                if (chars[i] == '(') {
                    checkCount++;
                }
                else if (chars[i] == ')') {
                    checkCount--;
                }

                if (checkCount == 0) {
                    String key = number + str.substring(0, i + 1);
                    for (int j = 0; j < Integer.parseInt(number); j++) {
                        result += str.substring(1, i);
                    }

                    map.put(key, result);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        String compressed = "2(3(hi)co)";
        String result = new Solution().solution(compressed);

        System.out.println(result);
    }
}
