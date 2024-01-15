package jan_16_2024;

import java.util.Stack;

public class SwapNumbers {
	private int answer = Integer.MAX_VALUE;

	public static void main(String[] args) {
		// int[] numbers = {10, 40, 20, 30};
		int[] numbers = {3, 7, 2, 8, 6, 4, 5, 1};
		int k = 3;

		SwapNumbers swapNumbers = new SwapNumbers();

		System.out.println("" + swapNumbers.solution(numbers, k));
	}

	public int solution(int[] numbers, int k) {
		return findResult(numbers, k);
	}

	private int findResult(int[] numbers, int k) {
		Stack<Integer> stack = new Stack<>();
		checkNumbers(numbers, stack, k);

		return answer == Integer.MAX_VALUE ? -1 : answer;
	}

	private void checkNumbers(int[] numbers, Stack<Integer> stack, int k) {
		if (stack.size() == numbers.length) {
			if (check(stack, k)) {
				int count = checkCount(stack, numbers);

				answer = Math.min(count, answer);
			}
			return;
		} else {
			for (int number : numbers) {
				if (stack.contains(number)) {
					continue;
				}

				stack.add(number);
				checkNumbers(numbers, stack, k);
				stack.pop();
			}
		}
	}

	private boolean check(Stack<Integer> stack, int k) {
		for (int i = 1; i < stack.size(); i++) {
			int prev = stack.get(i - 1);
			int curr = stack.get(i);

			int check = Math.abs(curr - prev);

			if (check > k) {
				return false;
			}
		}

		return true;
	}

	private int checkCount(Stack<Integer> stack, int[] numbers) {
		int count = 0;

		for (int i = 0; i < stack.size(); i++) {
			if (stack.get(i) != numbers[i]) {
				++count;
			}
		}

		return count - 1;
	}
}
