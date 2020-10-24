package NHN_PreTest1;

import java.io.*;
import java.util.Iterator;
import java.util.Stack;

public class p3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numOfOrder = Integer.parseInt(br.readLine());
        String[] orderArr = new String[numOfOrder];

        for (int i = 0; i < orderArr.length; i++) {
            orderArr[i] = br.readLine();
        }

        solution(numOfOrder, orderArr);

        br.close();
        bw.flush();
        bw.close();
    }

    private static void solution(int numOfOrder, String[] orderArr) {
        String[] result = new String[orderArr.length];

        for (int i = 0; i < orderArr.length; i++) {
            result[i] = "";
            Stack<String> stack1 = new Stack<>();
            Stack<String> stack2 = new Stack<>();
            Stack<String> stack3 = new Stack<>();
            String[] str = orderArr[i].split("");
            String recent = "";
            for (int j = str.length - 1; j >= 0; j--) {
                if (str[j].equals(")")) {
                    stack2.push(str[j]);
                }
                else if (str[j].equals("(")) {
                    stack2.push(str[j]);
                }
                else if (str[j].equals("R") || str[j].equals("G") || str[j].equals("B")) {
                    if (recent.equals("(")) {
                        String tmp = "";
                        while (!stack1.isEmpty()) {
                            tmp += str[j] + stack1.pop();
                        }
                        String[] tmpArr = tmp.split("");
                        for (int k = tmpArr.length-1; k >= 0; k--) {
                            stack1.push(tmpArr[k]);
                        }
                    }
                    else {
                        stack1.push(str[j]);
                    }
                }
                else {
                    if (recent.equals("(")) {
                        String tmp = "";
                        String tmp2 = "";
                        while (!stack1.isEmpty()) {
                            tmp += stack1.pop();
                        }
                        for (int k = 0; k < Integer.parseInt(str[j]); k++) {
                            tmp2 += tmp;
                        }
                        String[] tmp2Arr = tmp2.split("");
                        for (int k = tmp2Arr.length - 1; k >= 0; k--) {
                            stack1.push(tmp2Arr[k]);
                        }
                    }
                    else {
                        String tmp = stack1.pop();
                        String tmp2 = "";
                        for (int k = 0; k < Integer.parseInt(str[j]); k++) {
                            tmp2 += tmp;
                        }
                        String[] tmp2Arr = tmp2.split("");
                        for (int k = tmp2Arr.length - 1; k >= 0; k--) {
                            stack1.push(tmp2Arr[k]);
                        }
                    }
                }

                if (!str[j].equals("(") && !str[j].equals(")") && recent.equals("(")) {
                    Iterator<String> iter = stack1.iterator();
                    while (iter.hasNext()) {
                        result[i] = iter.next() + result[i];
                    }
                    stack1.clear();
                }
                recent = str[j];
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
