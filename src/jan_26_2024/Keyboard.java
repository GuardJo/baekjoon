package jan_26_2024;

import java.util.HashMap;
import java.util.Map;

public class Keyboard {
	public static void main(String[] args) {
		String s = "423692";
		String keypad = "923857614";

		System.out.println(solution(s, keypad) + "");
	}

	private static int solution(String s, String keypad) {
		int result = 0;
		String[] inputs = s.split("");
		Map<String, int[]> keyPadMap = setKeyMap(keypad);
		String current = inputs[0];

		for (String input : inputs) {
			int[] currentIndexes = keyPadMap.get(current);
			int[] nextIndexes = keyPadMap.get(input);
			result += calcTime(currentIndexes[0], currentIndexes[1], nextIndexes[0], nextIndexes[1]);
			current = input;
		}

		return result;
	}

	private static int calcTime(int x1, int y1, int x2, int y2) {
		int time = Math.abs(x1 - x2) + Math.abs(y1 - y2);

		if (x1 != x2 && y1 != y2) {
			time = Math.round((float)time / 2);
		}

		return time;
	}

	private static Map<String, int[]> setKeyMap(String keypad) {
		Map<String, int[]> keyPadMap = new HashMap<>();
		int x = 0;
		int y = 0;

		for (String key : keypad.split("")) {
			if (y > 2) {
				y = 0;
				++x;
			}
			int[] indexes = {x, y++};
			keyPadMap.put(key, indexes);
		}

		return keyPadMap;
	}
}
