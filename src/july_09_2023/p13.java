package july_09_2023;

public class p13 {
    public static void main(String[] args) {
        int base10 = 50;
        int answer = changeAds(base10);

        System.out.println(answer);
    }

    public static int changeAds(int base10) {
        return negateBitsAndConvertToDecimal(base10);
    }

    private static int negateBitsAndConvertToDecimal(int num) {
        String binary = Integer.toBinaryString(num); // 주어진 수를 이진수로 변환
        StringBuilder negatedBinary = new StringBuilder();

        for (char c : binary.toCharArray()) {
            if (c == '0') {
                negatedBinary.append('1');
            } else {
                negatedBinary.append('0');
            }
        }

        return Integer.parseInt(negatedBinary.toString(), 2);
    }
}
