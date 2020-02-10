package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p1929 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		
		String s = in.nextLine();
		
		int start = Integer.parseInt(s.split(" ")[0]);
		int end = Integer.parseInt(s.split(" ")[1]);
		boolean prime = true;
		
		while (start <= end) {
			if (start < 2) {
				prime = false;
			}
			for (int i = 2; i < Math.sqrt(end); i++) {
				if (start != i && start % i == 0) {
					prime = false;
					break;
				}
			}
			if (prime) {
				list.add(start);
			}
			start++;
			prime = true;
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		in.close();
	}
}
