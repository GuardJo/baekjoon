package SkillCheckTest.Level01;

public class CountPandY {
    public static void main(String[] args) {
        String s = "Pyy";
        boolean result = solution(s);

        System.out.println(result);
    }

    private static boolean solution(String s) {
        boolean answer = true;
        s = s.toUpperCase();
        String[] str = s.split("");
        int p = 0;
        int y = 0;

        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("P")) {
                p++;
            }
            else if (str[i].equals("Y")) {
                y++;
            }
        }
        if (p + y != 0) {
            if (p != y) {
                answer = false;
            }
        }
        return answer;
    }
}
