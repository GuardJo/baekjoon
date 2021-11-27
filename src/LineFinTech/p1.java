package LineFinTech;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 선입선출, 후입선출 원가 계산
 */
public class p1 {
    public static int[] solution(String[] record) {
        int[] answer = new int[2];
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        for (String str : record) {
            String[] tmp = str.split(" ");
            switch (tmp[0]) {
                case "P" :
                    for (int i = 0; i < Integer.parseInt(tmp[2]); i++) {
                        int pay = Integer.parseInt(tmp[1]);
                        stack.push(pay);
                        queue.add(pay);
                    }
                    break;
                case "S" :
                    for (int i = 0; i < Integer.parseInt(tmp[2]); i++) {
                        answer[0] += queue.poll();
                        answer[1] += stack.pop();
                    }
                    break;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        String[] record = {"P 300 6", "P 500 3", "S 1000 4", "P 600 1", "S 1200 2"};
        int[] result = solution(record);

        System.out.println(result[0] + " " + result[1]);
    }
}
