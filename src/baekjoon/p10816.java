package baekjoon;

import java.io.*;
import java.util.Arrays;

public class p10816 {
    private static int searchIndex (int[] arr, int n, int start, int end) {
        int mid = (end + start) / 2;
        if (end - start < 2) {
            return 0;
        }
        if (n == arr[mid]) {
            return mid;
        }
        else if (n < arr[mid]) {
            return searchIndex(arr, n, start, mid-1);
        }
        else {
            return searchIndex(arr, n, mid+1, end);
        }
    }
    private static int numberCount (int[] arr, int n, int index) {
        int count = 1;
        for (int i = index+1; i < arr.length; i++) {
            if (arr[i] != n) {
                break;
            }
            else {
                count++;
            }
        }
        for (int i  = index-1; i >= 0; i--) {
            if (arr[i] != n) {
                break;
            }
            else {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cardCount = Integer.parseInt(br.readLine());
        int[] cards = new int[cardCount];
        String s = br.readLine();
        String[] str = s.split(" ");
        for (int i = 0; i < cards.length; i++) {
            cards[i] = Integer.parseInt(str[i]);
        }

        Arrays.sort(cards);

        int selectCount = Integer.parseInt(br.readLine());

        s = br.readLine();
        str = s.split(" ");
        for (int i = 0; i < selectCount; i++) {
            int num = Integer.parseInt(str[i]);
            bw.write(numberCount(cards, num, searchIndex(cards, num, 0, cards.length-1)));
        }
        bw.write("\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
