package SkillCheckTest.Level01;

public class SecretMap {
    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        String[] result = solution(n, arr1, arr2);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }

    private static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int[][] arr3 = new int[n][n];

        setMap(n, arr1, arr3);
        setMap(n, arr2, arr3);

        for (int i = 0; i < arr3.length; i++) {
            answer[i] = "";
            for (int j = 0; j < arr3[i].length; j++) {
                if (arr3[i][j] == 1) {
                    answer[i] += "#";
                }
                else {
                    answer[i] += " ";
                }
            }
        }

        return answer;
    }

    private static void setMap(int n, int[] arr1, int[][] arr3) {
        for (int i = 0; i < arr1.length; i++) {
            String digit = Integer.toBinaryString(arr1[i]);
            while (digit.length() < n) {
                digit = "0" + digit;
            }
            String[] s = digit.split("");
            for (int j = 0; j < s.length; j++) {
                if (s[j].equals("1")) {
                    arr3[i][j] = Integer.parseInt(s[j]);
                }
            }
        }
    }
}
