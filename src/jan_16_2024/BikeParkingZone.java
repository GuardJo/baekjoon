package jan_16_2024;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class BikeParkingZone {
	public static void main(String[] args) {
		int n = 6;
		int k = 17;
		int[][] roads = {{5, 4, 6}, {5, 2, 5}, {0, 4, 2}, {2, 3, 3}, {1, 2, 7}, {0, 1, 3}};

		// int n = 4;
		// int k = 11;
		// int[][] roads = {{0, 1, 2}, {1, 2, 7}, {2, 3, 10}, {3, 0, 9}};

		int[] result = solution(n, k, roads);

		for (int r : result) {
			System.out.print(r + " ");
		}
	}

	public static int[] solution(int n, int k, int[][] roads) {
		int[] answer = {-1};
		Graph graph = new Graph();

		for (int[] road : roads) {
			graph.addEdges(road[0], road[1], road[2]);
			graph.addEdges(road[1], road[0], road[2]);
		}

		Set<Integer> result = graph.findVertexes(0, k);

		return result.isEmpty() ? answer : result.stream()
			.sorted()
			.mapToInt(Integer::intValue)
			.toArray();
	}

	static class Graph {
		private final Map<Integer, Map<Integer, Integer>> edges = new HashMap<>();

		public void addEdges(int base, int vertex, int weight) {
			if (!this.edges.containsKey(base)) {
				this.edges.put(base, new HashMap<>());
			}

			this.edges.get(base).put(vertex, weight);
		}

		public Set<Integer> findVertexes(int startVertex, int targetWeight) {
			Stack<Integer> visitVertexes = new Stack<>();
			Set<Integer> result = new LinkedHashSet<>();
			traverse(startVertex, targetWeight, 0, visitVertexes, result);

			return result;
		}

		private void traverse(int currentVertex, int targetWeight, int currentWeight, Stack<Integer> visitVertexes, Set<Integer> result) {
			int updateWeight = visitVertexes.isEmpty() ? 0 : edges.get(visitVertexes.peek()).get(currentVertex);
			currentWeight += updateWeight;

			if (currentWeight == targetWeight) {
				result.add(currentVertex);
				visitVertexes.add(currentVertex);
			} else if (currentWeight > targetWeight) {
				return;
			} else {
				visitVertexes.add(currentVertex);
				Map<Integer, Integer> nextEdges = edges.get(currentVertex);
				for (int next : nextEdges.keySet()) {
					traverse(next, targetWeight, currentWeight, visitVertexes, result);
				}
			}
			visitVertexes.pop();
		}
	}
}
