package bucketPlace;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class p1 {
    public static void main(String[] args) {
        String str = "a3c11d1c3d3";
        String result = solution(str);

        System.out.println("answer : " + result);
    }

    public static String solution(String str) {
        String answer = "";
        String[] strArr = sepherateString(str).split(" ");
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();

        list.add(strArr[0]);

        for (int i = 1; i < strArr.length; i++) {
            String s = strArr[i];
            if (Character.isDigit(s.toCharArray()[0])) {
                String key = strArr[i - 1];
                if (map.isEmpty() || !map.containsKey(key)) {
                    map.put(key, Integer.parseInt(s));
                }
                else if (map.containsKey(key)){
                    map.replace(key, map.get(key) + Integer.parseInt(s));
                }
            }
            else {
                if (!list.contains(s)) {
                    list.add(s);
                }
            }
        }

        for (String s : list) {
            answer += s + map.get(s);
        }

        return answer;
    }

    private static String sepherateString(String str) {
        char[] inputArray = str.toCharArray();
        String tmpStr = "";
        tmpStr += inputArray[0];

        for (int i = 1; i < inputArray.length; i++) {
            char tmp = inputArray[i];
            if (Character.isDigit(tmp)) {
                if (Character.isDigit(inputArray[i - 1])) {
                    tmpStr += tmp;
                }
                else {
                    tmpStr += " " + tmp;
                }
            }
            else {
                tmpStr += " " + tmp;
            }
        }

        return tmpStr;
    }
}
