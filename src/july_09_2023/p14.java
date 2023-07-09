package july_09_2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p14 {
    private static int MIN_VALUE = Integer.MAX_VALUE;
    public static void main(String[] args) {
        int[] costReq = {2, 3, 4, 2};
        int[] timeReq = {1, 1, 1, 1};
        List<Integer> cost = setRequest(costReq);
        List<Integer> time = setRequest(timeReq);

        int answer = getMinCost(cost, time);

        System.out.println(answer);
    }

    public static int getMinCost(List<Integer> cost, List<Integer> time) {
        printRequest(cost);
        printRequest(time);

        traverseDistinctDigitCombinations(cost.size(), cost, time);

        return MIN_VALUE;
    }

    private static void traverseDistinctDigitCombinations(int size, List<Integer> cost, List<Integer> time) {
        if (size <= 0) {
            return;
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }

        int[] combination = new int[size];
        boolean[] used = new boolean[size];

        traverseDistinctDigitCombinationsHelper(list, combination, used, 0, cost, time);
    }

    private static void traverseDistinctDigitCombinationsHelper(List<Integer> list, int[] combination, boolean[] used, int currentIndex, List<Integer> cost, List<Integer> time) {
        if (currentIndex == list.size()) {
            calc(combination, cost, time);
            return;
        }

        for (int i = 0; i < list.size(); i++) {
            if (!used[i]) {
                combination[currentIndex] = list.get(i);
                used[i] = true;

                traverseDistinctDigitCombinationsHelper(list, combination, used, currentIndex + 1, cost, time);

                used[i] = false;
            }
        }
    }

    private static void calc(int[] combination, List<Integer> cost, List<Integer> time) {
        int result = 0;

        for (int i = 0; i < combination.length; i++) {
            try {
                int index = combination[i];
                result += cost.get(index);

                for (int j = 0; j < time.get(index); j++) {
                    ++i;
                }
            } catch (IndexOutOfBoundsException e) {
                break;
            }
        }

        if (result < MIN_VALUE) {
            MIN_VALUE = result;
        }
    }

    private static void printRequest(List<Integer> list) {
        list.forEach((item) -> System.out.print(item + ", "));
        System.out.println();
    }


    private static List<Integer> setRequest(int[] request) {
        List<Integer> list = new ArrayList<>();

        Arrays.stream(request).forEach(list::add);

        return list;
    }
}
