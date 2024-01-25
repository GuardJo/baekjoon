package jan_26_2024;

import java.util.List;
import java.util.stream.Collectors;

public class ProjectEstimates {
	public static void main(String[] args) {
		List<Integer> projectCosts = List.of(1, 5, 3, 4, 2);
		int target = 2;

		System.out.println(solution(projectCosts, target) + "");
	}

	private static int solution(List<Integer> projectCosts, int target) {
		projectCosts = projectCosts.stream()
			.sorted()
			.collect(Collectors.toList());

		return countTarget(target, projectCosts);
	}

	private static int countTarget(int target, List<Integer> costs) {
		int count = 0;

		for (int i = 0; i < costs.size(); i++) {
			int base = costs.get(i);
			int nextIndex = i + 1;

			int next = 0;

			do {
				if (nextIndex > costs.size() - 1) {
					break;
				}

				next = costs.get(nextIndex++);
				if (next - base == target) {
					count++;
				}
			} while (next - base < target);
		}

		return count;
	}
}
