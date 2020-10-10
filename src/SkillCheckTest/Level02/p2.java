package SkillCheckTest.Level02;

public class p2 {
    public static void main(String[] args) {
        int[] price = {1, 2, 3, 2, 3};
        int[] result = solution(price);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }

    private static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            int base = prices[i];
            int count = 0;
            for (int j = i+1; j < prices.length; j++) {
                count++;
                if (base > prices[j]) {
                    break;
                }
            }
            answer[i] = count;
        }
        return answer;
    }
}
