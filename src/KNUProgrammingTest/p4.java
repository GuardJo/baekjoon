package KNUProgrammingTest;

import java.util.ArrayList;

public class p4{
    public static void main(String[] args) {
        int n = 10;
        int[] t1 = {9, 4, 4, 4, 7};
        int[] t2 = {2, 10, 7, 6, 3};
        int[] result = solution(n, t1, t2);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }

    private static int[] solution(int n, int[] t1, int[] t2) {
        int[] answer = {};
        ArrayList<ArrayList<Integer>> students = new ArrayList<>();
        ArrayList<Integer> answerList = new ArrayList<>();
        int[] isSolo = new int[n + 1];
        int[] isFinish = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            students.add(new ArrayList<>());
        }
        for (int i = 0; i < t1.length; i++) {
            students.get(t1[i]).add(t2[i]);
            students.get(t2[i]).add(t1[i]);
            isSolo[t1[i]] = 1;
            isSolo[t2[i]] = 1;
        }

        for (int i = 0; i < students.size(); i++) {
            if (isSolo[i] == 0) {
                answerList.add(i);
            }
            else if (students.get(i).size() > 0){
                connectStudent(students, i, isFinish);
            }
        }

        return answer;
    }

    private static void connectStudent(ArrayList<ArrayList<Integer>> students, int index, int[] isFinish) {
        for (int i = 0; i < students.get(index).size(); i++) {
            if (isFinish[students.get(index).get(i)] == 0) {
                connectStudent(students, students.get(index).get(i), isFinish);
            }
        }

    }
}
