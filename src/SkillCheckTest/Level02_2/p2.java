package SkillCheckTest.Level02_2;



public class p2 {
    public static void main(String[] args) {
        int bridge_length = 100;
        int weight = 100;
        int[] truck_weights = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        int result = solution(bridge_length, weight, truck_weights);

        System.out.println(result);
    }

    private static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = bridge_length + 1;
        int currentWeight = truck_weights[0];

        for (int i = 1; i < truck_weights.length; i++) {
            if (currentWeight + truck_weights[i] <= weight) {
                currentWeight += truck_weights[i];
                answer++;
            }
            else {
                currentWeight = truck_weights[i];
                answer += 1 + bridge_length;
            }
        }
        return answer;
    }
}
