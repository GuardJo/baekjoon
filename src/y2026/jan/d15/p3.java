package y2026.jan.d15;

import java.util.*;

public class p3 {
    public static void main(String[] args) {
        String s = "bucketplace";

        String result = solution(s);

        System.out.println(result);
    }

    private static String solution(String s) {
        String[] arr = s.split("");

        Map<String, Integer> map = convertMap(arr);

        String[] answer = map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .map((entry) -> {
                    return String.valueOf(entry.getKey()).repeat(Math.max(0, entry.getValue()));
                })
                .toArray(String[]::new);

        return String.join("", answer);
    }

    private static Map<String, Integer> convertMap(String[] strings) {
        Map<String, Integer> stringIntegerMap = new HashMap<>();

        for (String string : strings) {
            if (stringIntegerMap.containsKey(string)) {
                stringIntegerMap.put(string, stringIntegerMap.get(string) + 1);
            } else {
                stringIntegerMap.put(string, 1);
            }
        }

        return stringIntegerMap;
    }
}
