package baekjoon.p9x;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p9020 {
	public static boolean isPrime(int n) {
		if (n == 2) {
			return true;
		}
		else {
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					return false;
				}
			}
			return true;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int size = Integer.parseInt(br.readLine());

		for (int i = 0; i < size; i++) {
			int number = Integer.parseInt(br.readLine());
			int n1 = number/2;
			int n2 = number/2;
			boolean isFinish = false;
			while (!isFinish) {
				boolean isN1 = isPrime(n1);
				boolean isN2 = isPrime(n2);
				while (!isN1 || !isN2) {
					if (!isN1) {
						isN1 = isPrime(--n1);
					}
					if (!isN2) {
						isN2 = isPrime(++n2);
					}
				}
				if (n1 + n2 == number) {
					isFinish = true;
				}
				else if (n1 + n2 > number) {
					n1--;
				}
				else {
					n2++;
				}
			}
			bw.write(n1 + " " + n2 + "\n");
		}
		bw.flush();
		bw.close();

	}
}