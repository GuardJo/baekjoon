package jan_26_2024;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TeamFormation {
	public static void main(String[] args) {
		List<Integer> data = List.of(10, 20, 10, 15, 5, 30, 20);
		List<Integer> score = new ArrayList<>(data);
		int teamSize = 2;
		int k = 3;

		System.out.println(String.valueOf(solution(score, teamSize, k)));
	}

	private static long solution(List<Integer> score, int team_size, int k) {
		List<Integer> pickedNumbers = new ArrayList<>();

		while (pickedNumbers.size() < team_size) {
			List<Integer> subList = score.subList(0, k);
			Integer max = subList.stream()
				.mapToInt(Integer::intValue)
				.max()
				.getAsInt();

			List<Integer> subList2 = score.subList(score.size() - k, score.size());
			Integer max2 = subList2.stream()
				.mapToInt(Integer::intValue)
				.max()
				.getAsInt();

			if (max >= max2) {
				score.remove(max);
				pickedNumbers.add(max);
			} else {
				score.remove(max2);
				pickedNumbers.add(max2);
			}
		}

		return pickedNumbers.stream()
			.mapToInt(Integer::intValue)
			.sum();
	}

	private static void traverse(List<Integer> score, int teamSize, int k, List<Integer> result) {
		if (score.size() <= teamSize * 2) {
			return;
		}

		List<Integer> left = score.subList(0, k);
		List<Integer> right = score.subList(score.size() - k, score.size());

		Integer leftMax = left.stream().max(Comparator.comparing(Integer::intValue)).get();
		Integer rightMax = right.stream().max(Comparator.comparing(Integer::intValue)).get();

		if (leftMax >= rightMax) {
			result.add(leftMax);
			left.remove(leftMax);
		} else {
			result.add(rightMax);
			right.remove(rightMax);
		}

		List<Integer> subList = new ArrayList<>(left);
		subList.addAll(right);

		traverse(subList, teamSize, k, result);
	}
}
