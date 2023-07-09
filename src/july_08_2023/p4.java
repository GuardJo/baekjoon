package july_08_2023;

import java.util.Arrays;
import java.util.Stack;

public class p4 {
    public static void main(String[] args) {
        int maxSize = 3;
        String[] actions = {"1", "2", "B", "B", "3"};
        String[] result = solution(maxSize, actions);

        Arrays.stream(result)
                .forEach(System.out::println);
    }

    public static String[] solution(int maxSize, String[] actions) {
        String[] answer = {};
        Stack<String> visited = new RecentStringStack(maxSize);
        Stack<String> b = new Stack<>();
        Stack<String> f = new Stack<>();
        String current = null;

        for (String action : actions) {
            if (action.equals("B")) {
                if (!b.empty()) {
                    f.push(current);
                    current = b.pop();
                    visited.push(current);
                }
            } else if (action.equals("F")) {
                if (!f.empty()) {
                    b.push(current);
                    current = f.pop();
                    visited.push(current);
                }
            } else {
                if (current != null) {
                    b.push(current);
                }

                visited.push(action);
                current = action;
            }
        }

        String[] arr = visited.toArray(new String[0]);
        answer = new String[arr.length];

        int index = arr.length - 1;
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arr[index--];
        }

        return answer;
    }

    static class RecentStringStack extends Stack<String> {
        private final int maxSize;

        public RecentStringStack(int maxSize) {
            this.maxSize = maxSize;
        }

        @Override
        public String push(String item) {
            if (contains(item)) {
                removeOldestOccurrences(item);
            }
            super.push(item);
            if (size() > maxSize) {
                removeElementAt(0);
            }
            return item;
        }

        private void removeOldestOccurrences(String item) {
            int index = lastIndexOf(item);
            while (index != -1) {
                removeElementAt(index);
                index = lastIndexOf(item);
            }
        }
    }
}
