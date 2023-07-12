package baekjoon.p2x;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p2447 {
	public static void makeStar(String[][] arr, int n, int x, int y) {
		if (n == 1) {
			arr[x][y] = "*";
		}
		else {
			int div = n / 3;
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (i == 1 && j == 1) {
						continue;
					} else {
						makeStar(arr, div, x + (div * i), y + (div * j));
					}
				}
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int number = Integer.parseInt(br.readLine());

		String[][] stars = new String[number][number];
		for (int i = 0; i < stars.length; i++) {
			for (int j = 0; j < stars.length; j++) {
				stars[i][j] = " ";
			}
		}

		makeStar(stars, number, 0, 0);

		for (int i = 0; i < stars.length; i++) {
			for (int j = 0; j < stars.length; j++) {
				bw.write(stars[i][j]);
			}
			bw.write("\n");
		}

		br.close();
		bw.flush();
		bw.close();
	}
}
