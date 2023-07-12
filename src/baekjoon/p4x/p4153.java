package baekjoon.p4x;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p4153 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		boolean isFinish = false;
		
		while (!isFinish) {
			String s = br.readLine();
			if (s.equals("0 0 0")) {
				isFinish = true;
			}
			else {
				String[] str = s.split(" ");
				int x = Integer.parseInt(str[0]);
				int y = Integer.parseInt(str[1]);
				int z = Integer.parseInt(str[2]);
				
				if ((Math.pow(x, 2) + Math.pow(y, 2) == Math.pow(z, 2)) || (Math.pow(x, 2) + Math.pow(z, 2) == Math.pow(y, 2))
						|| (Math.pow(y, 2) + Math.pow(z, 2) == Math.pow(x, 2))) {
					bw.append("right\n");
				}
				else {
					bw.append("wrong\n");
				}
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
