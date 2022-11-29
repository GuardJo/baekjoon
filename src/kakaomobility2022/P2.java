package kakaomobility2022;

import java.util.ArrayList;
import java.util.List;

public class P2 {
    public boolean solution(int N, int[] A, int[] B) {
        boolean result = false;
        List<List<Integer>> graph = generateGraph(N, A, B);

        result = checkGraph(graph);

        return result;
    }

    public boolean checkGraph(List<List<Integer>> graph) {
        boolean result = false;

        int nodeNumber = 0;

        while (nodeNumber < graph.size() - 1) {
            List<Integer> node = graph.get(nodeNumber);

            if (node.contains(nodeNumber + 1)) {
                nodeNumber++;
            }
            else {
                break;
            }
        }

        if (nodeNumber == graph.size() - 1) {
            result = true;
        }

        return result;
    }

    public List<List<Integer>> generateGraph(int n, int[] a, int[] b) {
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < a.length; i++) {
            int indexA = a[i] - 1;
            int indexB = b[i] - 1;

            graph.get(indexA).add(indexB);
            graph.get(indexB).add(indexA);
        }

        return graph;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] a = {1, 1, 2, 2, 3};
        int[] b = {3, 4, 5, 4, 5};

        boolean result = new P2().solution(n, a, b);

        System.out.println(result);
    }
}
