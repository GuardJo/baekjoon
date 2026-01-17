package y2026.jan.d17;

public class p1 {
    public static void main(String[] args) {
        int[] transactions = {100_000, -200_000, 100_000, -300_000};
        int rate = 11;

        int result = solution(transactions, rate);

        System.out.println(result);
    }

    private static int solution(int[] transactions, int rate) {
        int dailyMinMoney = calcDailyMinMoney(transactions);

        return calcResultMoney(Math.abs(dailyMinMoney), rate);
    }

    private static int calcResultMoney(int baseMoney, int rate) {
        baseMoney /= 10_000;
        return baseMoney * rate;
    }

    private static int calcDailyMinMoney(int[] transactions) {
        int totalMoney = 0;
        int dailyMinValue = 0;

        for (int transaction : transactions) {
            totalMoney += transaction;
            dailyMinValue = Math.min(dailyMinValue, totalMoney);
        }

        return dailyMinValue;
    }
}
