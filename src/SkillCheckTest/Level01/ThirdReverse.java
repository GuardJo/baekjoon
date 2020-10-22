package SkillCheckTest.Level01;

import java.util.ArrayList;

public class ThirdReverse {
    public static void main(String[] args) {
        int n = 6;
        int result = solution(n);

        System.out.println(result);
    }

    private static int solution(int n) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (n >= 3) {
            list.add(n % 3);
            n = n / 3;
        }
        list.add(n);

        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i) * Math.pow(3, list.size() - 1 - i);
        }
        return answer;
    }
}
