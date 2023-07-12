package baekjoon.p4x;

public class p4673 {
	public static void main(String[] args) {
		int size = 10001;
		int[] numbers = new int[size];
		
		for (int i = 1; i <= 10000; i++) {
			int num = self(i);
			if (num <= 10000) {
				numbers[num] = 1;
			}
		}
		
		for (int i = 1; i <= 10000; i++) {
			if (numbers[i] == 0) {
				System.out.println(i);
			}
		}
	}
	
	public static int self(int num) {
		int sum = num;
		while (true) {
			if (num == 0) {
				break;
			}
			sum += num%10;
			num = num/10;
		}
		return sum;
	}
}
