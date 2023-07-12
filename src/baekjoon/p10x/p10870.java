package baekjoon.p10x;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p10870 {
	public static int fib (int n) {
		if (n < 2) {
			return n;
		}
		else {
			return fib(n-1) + fib(n-2);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int number = Integer.parseInt(br.readLine());
		
		bw.append(fib(number) + "\n");
		
		br.close();
		bw.flush();
		bw.close();
	}
}
