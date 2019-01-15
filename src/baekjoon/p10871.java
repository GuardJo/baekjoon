package baekjoon;

import java.util.Scanner;

public class p10871 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		String[] input = in.nextLine().split(" ");
		String[] input2 = in.nextLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int x = Integer.parseInt(input[1]);
		
		for (int i = 0; i < n; i++) {
			if (x > Integer.parseInt(input2[i])) {
				System.out.print(input2[i] + " ");
			}
		}
		
		in.close();
	}

}
