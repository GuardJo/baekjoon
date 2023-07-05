package toss;

public class CumstomRoundRobin {

    public int[][] solution(int servers, boolean sticky, int[] requests) {
        int[][] answer = new int[servers][requests.length];
        int[] currentServer = new int[servers];

        for (int i = 0; i < requests.length; i++) {
            int serverIndex;
            if (sticky) {
                serverIndex = (i > 0 && requests[i - 1] == requests[i]) ? currentServer[i - 1] : i % servers;
                currentServer[i] = serverIndex;
            } else {
                serverIndex = i % servers;
            }

        }


        return answer;
    }

    public static void main(String[] args) {
        CumstomRoundRobin cumstomRoundRobin = new CumstomRoundRobin();

        int servers = 2;
        boolean sticky = false;
        int[] requests = new int[]{1, 2, 3, 4};

        int[][] result = cumstomRoundRobin.solution(servers, sticky, requests);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.println(result[i][j]);
            }
        }
    }
}
