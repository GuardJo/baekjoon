package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p1085 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		
		String[] str = s.split(" ");
		int x = Integer.parseInt(str[0]);
		int y = Integer.parseInt(str[1]);
		int w = Integer.parseInt(str[2]);
		int h = Integer.parseInt(str[3]);
		
		int resultX = w - x;
		int resultY = h - y;
		
		if (resultX > x) {
			resultX = x;
		}
		if (resultY > y) {
			resultY = y;
		}
		
		if (resultX > resultY) {
			resultX = resultY;
		}
		bw.append(resultX + "\n");
		
		bw.flush();
		br.close();
		bw.close();
	}
}
