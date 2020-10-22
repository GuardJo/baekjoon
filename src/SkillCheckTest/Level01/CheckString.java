package SkillCheckTest.Level01;


public class CheckString {
    public static void main(String[] args) {
        String s = "1111a";
        boolean result = solution(s);

        System.out.println(result);
    }

    private static boolean solution(String s) {
        boolean answer = false;
        String[] str = s.split("");
        if (str.length == 4 || str.length == 6) {
            if (isNumeric(s)) {
                answer = true;
            }
        }
        return answer;
    }

    private static boolean isNumeric(String s) {
        try {
            int num = Integer.parseInt(s);
            return true;
        } catch (Exception e){
            return false;
        }

    }
}
