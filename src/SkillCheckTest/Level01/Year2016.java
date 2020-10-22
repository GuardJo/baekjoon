package SkillCheckTest.Level01;

public class Year2016 {
    public static void main(String[] args) {
        int a = 5;
        int b = 24;
        String result = solution(a, b);

        System.out.println(result);
    }

    private static String solution(int a, int b) {
        String answer = "";
        String[] days = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int day = 0;
        for (int i = 0; i < a - 1; i++) {
            day += month[i];
        }
        day += b - 1;
        answer = days[day % 7];
        return answer;
    }
}
