package baekjoon;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class p1966 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Queue<Integer> priority = new LinkedList<>();
		
		int loopCount = in.nextInt();
		int searchIndex = 0;
		int printCount = 0;
		
		for (int i = 0; i < loopCount; i++) {
			String s = in.nextLine();
			String[] str = s.split(" ");
			searchIndex = Integer.parseInt(str[1]);
			String element = in.nextLine();
			String[] elements = element.split(" ");
			for (int j = 0; j < elements.length; j++) {
				priority.add(Integer.parseInt(elements[j]));
			}
			int current = priority.poll();
			Iterator<Integer> iter = priority.iterator();
			
			while (iter.hasNext()) {
				if (current < iter.next()) {
					priority.add(current);
				}
				else {
					printCount++;
				}
			}
		}
		
		in.close();
	}
}
