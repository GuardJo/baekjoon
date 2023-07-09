package july_09_2023;

import java.util.HashSet;
import java.util.Set;

public class p12 {
    public static void main(String[] args) {
        String s = "xabbcacpqr";

        int answer = findShortestSubstring(s);

        System.out.println(answer);
    }

    public static int findShortestSubstring(String s) {
        return getMinRemovalsForUniqueString(s);
    }

    public static int getMinRemovalsForUniqueString(String str) {
        if (isUniqueString(str)) {
            return 0; // 이미 고유한 문자열인 경우 0 반환
        }

        int minLength = str.length(); // 최소 길이 초기화
        int n = str.length();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String substring = str.substring(0, i) + str.substring(j);
                if (isUniqueString(substring)) {
                    int removals = n - substring.length(); // 제거한 문자의 개수
                    minLength = Math.min(minLength, removals);
                }
            }
        }

        return minLength;
    }


    private static boolean isUniqueString(String str) {
        Set<Character> charSet = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (charSet.contains(c)) {
                return false; // 이미 등장한 문자가 있다면 중복된 문자가 있음
            }
            charSet.add(c); // 새로운 문자를 세트에 추가
        }

        return true; // 중복된 문자가 없으므로 고유한 문자들로만 이루어진 문자열
    }
}
