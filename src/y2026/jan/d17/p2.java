package y2026.jan.d17;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class p2 {
    public static void main(String[] args) {
        String order = "zyxwvutprqsonmlkjihgfedcba";
        String[] words = {"c", "cplusplus", "csharp", "javascript", "javas", "python"};

        String[] result = solution(order, words);
        System.out.println(Arrays.toString(result));
    }

    private static String[] solution(String order, String[] words) {
        Map<Character, Integer> orderMap = initOrderMap(order);
        Arrays.sort(words, (a, b) -> {
            char[] charA = a.toCharArray();
            char[] charB = b.toCharArray();

            for (int i = 0; i < Math.min(charA.length, charB.length); i++) {
                if (orderMap.get(charA[i]) < orderMap.get(charB[i])) {
                    return -1;
                } else if (orderMap.get(charA[i]) > orderMap.get(charB[i])) {
                    return 1;
                }
            }

            return charA.length > charB.length ? 1 : -1;
        });

        return words;
    }

    private static Map<Character, Integer> initOrderMap(String order) {
        Map<Character, Integer> orderMap = new HashMap<>();

        char[] orderArr = order.toCharArray();

        for (int i = 0; i < orderArr.length; i++) {
            orderMap.put(orderArr[i], i);
        }

        return orderMap;
    }
}
