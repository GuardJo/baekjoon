package july_09_2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p14p1 {
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

        int answer = 0;

        while (!cost.isEmpty()) {
            int baseIndex = findHighestIndex(time, time.size() - 1);
            answer += cost.remove(baseIndex);
            int baseTime = time.remove(baseIndex);

            for (int i = 0; i < baseTime; i++) {
                int index = findIndexOfMaxValue(cost);
                try {
                    time.remove(index);
                    cost.remove(index);
                } catch (IndexOutOfBoundsException e) {
                    break;
                }
            }
        }

        return answer;
    }

    public static int findHighestIndex(List<Integer> list, int target) {
        if (list == null || list.isEmpty()) {
            return -1;
        }

        int highestIndex = -1;
        for (int i = 0; i < list.size(); i++) {
            int currentNumber = list.get(i);
            if (currentNumber <= target) {
                if (highestIndex == -1 || currentNumber > list.get(highestIndex)) {
                    highestIndex = i;
                }
            }
        }

        return highestIndex;
    }

    public static int findIndexOfMaxValue(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return -1;
        }

        int maxIndex = 0;
        int maxValue = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            int currentValue = list.get(i);
            if (currentValue > maxValue) {
                maxValue = currentValue;
                maxIndex = i;
            }
        }

        return maxIndex;
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
