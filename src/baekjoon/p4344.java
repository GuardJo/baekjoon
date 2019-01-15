package baekjoon;

import java.util.Scanner;

public class p4344 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int c = Integer.parseInt(in.nextLine());
		
		for (int i = 0; i < c; i++) {
			float average = 0;
			String[] str = in.nextLine().split(" ");
			int size = Integer.parseInt(str[0]);
			int[] score = new int[size];
			for (int j = 0; j < size; j++) {
				score[j] = Integer.parseInt(str[j+1]);
				average += score[j];
			}
			average = average/size;
			float count = 0;
			for (int j = 0; j < size; j++) {
				if (score[j] > average) {
					count++;
				}
			}
			float result = count/size*100;
			System.out.println(String.format("%.3f", result) + "%");
		}
		
		in.close();
	}
}
