package kakaomobility2022;

public class P1 {
    public static void main(String[] args) {
        new P1().solution(1010101010);
    }

    public void solution(int N) {
        int enable_print = N % 10;
        while (N > 0) {
            if (enable_print == 0 && N % 10 != 0) {
                enable_print = 1;
            }
            if (enable_print > 0) {
                System.out.print(N % 10);
            }
            N = N / 10;
        }
    }
}
