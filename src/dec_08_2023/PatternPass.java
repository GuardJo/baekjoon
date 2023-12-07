package dec_08_2023;

public class PatternPass {
    public static void main(String[] args) {
        int[][] phone = {{0, 1, 0}, {1, 1, 1}, {1, 0, 0}, {0, 0, 1}};
        int result = solution(phone);

        System.out.println(result);
    }

    public static int solution(int[][] phone) {
        int answer = 0;
        int[][] visited = new int[phone.length][phone[0].length];

        for (int i = 0; i < phone.length; i++) {
            for (int j = 0; j < phone[i].length; j++) {
                int[] count = {0};
                countPattern(i, j, count, visited, phone);

                if (count[0] > 0) {
                    --count[0];
                }
                answer += count[0];
            }
        }

        return answer;
    }

    private static void countPattern(int x, int y, int[] count, int[][] visited, int[][] phone) {
        if (x >= visited.length || y >= visited[0].length || x < 0 || y < 0 || visited[x][y] == 1 || phone[x][y] == 0) {
            return;
        }
        ++count[0];
        visited[x][y] = 1;

        countPattern(x - 1, y, count, visited, phone); // 상
        countPattern(x - 1, y + 1, count, visited, phone); //우상
        countPattern(x, y + 1, count, visited, phone); // 우
        countPattern(x + 1, y + 1, count, visited, phone); // 우하
        countPattern(x + 1, y, count, visited, phone); // 하
        countPattern(x + 1, y - 1, count, visited, phone); // 좌하
        countPattern(x, y - 1, count, visited, phone); // 좌
        countPattern(x - 1, y - 1, count, visited, phone); // 좌상

        visited[x][y] = 0;
    }
}
