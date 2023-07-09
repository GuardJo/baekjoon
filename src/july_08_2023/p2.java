package july_08_2023;

import java.util.*;

public class p2 {
    public static void main(String[] args) {
        int[][] relationships = {{1, 2}, {2, 3}, {2, 3}, {2, 6}, {3, 4}, {4, 5}};
        int target = 1;
        int limit = 2;

        int answer = solution(relationships, target, limit);

        System.out.println(answer);
    }

    public static int solution(int[][] relationships, int target, int limit) {
        Map<Integer, List<Integer>> graph = createMap(relationships);
        int bestFriends = 0;
        int justFriends = 0;

        List<Integer> bf = graph.get(target);
        bestFriends = bf.size();
        justFriends = countAllFriends(graph, target, limit);

        return (bestFriends * 5) + (justFriends * 10) + justFriends;
    }

    private static int countAllFriends(Map<Integer, List<Integer>> friendsMap, int myNumber, int depthLimit) {
        Set<Integer> visited = new HashSet<>();  // 방문한 친구들을 저장하기 위한 Set
        Queue<Integer> queue = new LinkedList<>();  // BFS 탐색을 위한 큐
        queue.offer(myNumber);
        visited.add(myNumber);

        int friendCount = 0;
        int currentDepth = 0;

        while (!queue.isEmpty() && currentDepth <= depthLimit) {
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                int friend = queue.poll();

                // 현재 Depth에 있는 친구들의 수를 카운트
                if (currentDepth > 1) {
                    friendCount++;
                }

                List<Integer> connectedFriends = friendsMap.get(friend);
                if (connectedFriends != null) {
                    for (int connectedFriend : connectedFriends) {
                        if (!visited.contains(connectedFriend)) {
                            queue.offer(connectedFriend);
                            visited.add(connectedFriend);
                        }
                    }
                }
            }

            currentDepth++;
        }

        return friendCount;
    }

    private static Map<Integer, List<Integer>> createMap(int[][] relationship) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int[] ints : relationship) {
            int me = ints[0];
            int friend = ints[1];

            if (map.containsKey(me)) {
                map.get(me).add(friend);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(friend);
                map.put(me, list);
            }

            if (map.containsKey(friend)) {
                map.get(friend).add(me);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(me);
                map.put(friend, list);
            }
        }

        return map;
    }
}
