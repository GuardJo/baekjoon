package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p1002 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int cnt = Integer.parseInt(br.readLine());

		while (cnt > 0) {
			String s = br.readLine();
			String[] str = s.split(" ");
			int x1 = Integer.parseInt(str[0]);
			int y1 = Integer.parseInt(str[1]);
			int r1 = Integer.parseInt(str[2]);
			int x2 = Integer.parseInt(str[3]);
			int y2 = Integer.parseInt(str[4]);
			int r2 = Integer.parseInt(str[5]);

			int dx = (int) Math.pow(x1-x2, 2);
			int dy = (int) Math.pow(y1-y2, 2);
			int dist = dx + dy;
			
			if (r1 < r2) {
				int tmp = r1;
				r1 = r2;
				r2 = tmp;
			}
			
			if ((Math.pow(r1+r2, 2) == dist) || ((Math.pow(r1-r2, 2) == dist) && dist != 0)) {
				bw.append(1 + "\n");
			}
			else if ((dist > Math.pow(r1+r2, 2)) || (dist < Math.pow(r1-r2, 2))) {
				bw.append(0 + "\n");
			}
			else if (dist == 0 && r1 == r2) {
				bw.append(-1 + "\n");
			}
			else {
				bw.append(2 + "\n");
			}
			
			cnt--;
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
