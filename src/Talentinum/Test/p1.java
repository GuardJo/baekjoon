package Talentinum.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class p1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(br.readLine());
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }

        int result = balancedSum(arr);
        bw.write(result + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    private static int balancedSum(List<Integer> arr) {
        int answer = 0;
        int pivot = arr.size() / 2;
        boolean findPivot = false;
        do {
            int leftSum = 0;
            int rightSum = 0;

            for (int i = 0; i < pivot; i++) {
                leftSum += arr.get(i);
            }
            for (int i = pivot + 1; i < arr.size(); i++) {
                rightSum += arr.get(i);
            }
            if (leftSum == rightSum) {
                findPivot = true;
                answer = pivot;
            }
            else if (leftSum > rightSum) {
                pivot--;
            }
            else {
                pivot++;
            }
        } while (!findPivot && pivot >= 0 && pivot < arr.size());
        return answer;
    }
}
