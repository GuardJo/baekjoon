package toss;

public class VatCalculator {
    public long solution(long orderAmount, long taxFreeAmount, long serviceFee) {
        long answer = 0; // 과세금액 &% 10
        long provAmount = orderAmount;

        if (serviceFee > 0L) {
            provAmount -= serviceFee;
        }

        long taxAmount = Math.max(provAmount - taxFreeAmount, 1);

        return answer = Math.round(taxAmount * 0.1);
    }

    public static void main(String[] args) {
        VatCalculator vatCalculator = new VatCalculator();

        long orderAmount = 120;
        long taxFreeAmount = 20;
        long serviceFee = 0;

        long result = vatCalculator.solution(orderAmount, taxFreeAmount, serviceFee);

        System.out.println(result);
    }
}
