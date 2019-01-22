package baekjoon;

import java.util.Scanner;

public class p2577 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		int sum = a * b * c;
		int[] count = new int[10];
		
		String str = Integer.toString(sum);
		String[] str2 = str.split("");
		int[] result = new int[str2.length];
		for (int i = 0; i < str2.length; i++) {
			result[i] = Integer.parseInt(str2[i]);
			count[result[i]]++;
		}
		
		for (int i = 0; i < count.length; i++) {
			System.out.println(count[i]);
		}
		
		in.close();
	}
}
