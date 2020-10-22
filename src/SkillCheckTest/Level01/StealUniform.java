package SkillCheckTest.Level01;

public class StealUniform {
    static int max = 0;
    public static void main(String[] args) {
        int n = 3;
        int[] lost = {1};
        int[] reserve = {1};
        int result = solution(n, lost, reserve);

        System.out.println(result);
    }

    private static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] student = new int[n + 1];
        for (int i = 0; i < lost.length; i++) {
            student[lost[i]]--;
        }
        for (int i = 0; i < reserve.length; i++) {
            student[reserve[i]]++;
        }
        for (int i = 0; i < student.length; i++) {
            if (student[i] >= 0) {
                answer++;
            }
        }
        max = answer - 1;
        searchMax(student, 0, max);
        answer = max;
        return answer;
    }

    private static void searchMax(int[] student, int index, int count) {
        if (index == student.length) {
            return;
        } else {
            if (student[index] < 0) {
                if (index >= 0 && index <= student.length - 2) {
                    if (student[index + 1] > 0) {
                        student[index + 1]--;
                        student[index]++;
                        count++;
                        if (count > max) {
                            max = count;
                        }
                        index++;
                        searchMax(student, index, count);
                        index--;
                        student[index + 1]++;
                        student[index]--;
                        count--;
                    }
                }
                if (index > 0 && index <= student.length - 1) {
                    if (student[index - 1] > 0) {
                        student[index - 1]--;
                        student[index]++;
                        count++;
                        if (count > max) {
                            max = count;
                        }
                        index++;
                        searchMax(student, index, count);
                        index--;
                        student[index - 1]++;
                        student[index]--;
                        count--;
                    }
                }
            }

            index++;
            searchMax(student, index, count);

        }
    }
}
