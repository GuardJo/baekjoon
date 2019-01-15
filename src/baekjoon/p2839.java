package baekjoon;

import java.util.Scanner;

public class p2839 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int five = 0;
		int three = 0;

		while (in.hasNext()) {
			int number = in.nextInt();
			boolean result = true;
			while (number > 0) {
				if (number != 3 && number < 5) {
					result = false;
					break;
				}
				else {
					if (number % 5 != 0) {
						number = number - 3;
						three++;
					}
					else if (number % 5 == 0){
						five = number/5;
						number = 0;
					}
				}
			}
			if (result) {
				System.out.println(five+three);
			}
			else {
				System.out.println(-1);
			}
		}
		in.close();
	}
}
