package baekjoon.p1x;

import java.util.Scanner;

public class p1316 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num = Integer.parseInt(in.nextLine());
		int[] result = new int[num];
		for (int i = 0; i < num; i++) {
			String[] str = in.nextLine().split("");
			String last = "";
			for (int j = 0; j < str.length; j++) {
				String s = str[j];
				if (!s.equals(last) && !last.equals("")) {
					boolean d = false;
					for (int k = 0; k < j; k++) {
						if (s.equals(str[k])) {
							d = true;
						}
					}
					if (d) {
						result[i] = -1;
					}
				}
				last = s;
			}
		}
		int count = 0;
		for (int i = 0; i < result.length; i++) {
			if (result[i] == 0) {
				count++;
			}
		}
		
		System.out.println(count);
		in.close();
	}
}	
