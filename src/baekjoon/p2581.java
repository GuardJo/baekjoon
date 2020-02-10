package baekjoon;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class p2581 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();

		int start = in.nextInt();
		int end = in.nextInt();
		boolean prime = true;
		int sum = 0;
		
		while (start <= end) {
			if (start < 2) {
				prime = false;
			}
			for (int i = 2; i < start; i++) {
				if (start % i == 0) {
					prime = false;
				}
			}
			if (prime) {
				sum += start;
				list.add(start);
			}
			
			prime = true;
			start++;
		}
		if (list.isEmpty()) {
			System.out.println(-1);
		}
		else {
			System.out.println(sum);
			System.out.println(list.get(0));
		}

		in.close();
	}
}
