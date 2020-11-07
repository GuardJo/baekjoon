package WooahanTechCourse3;

import java.util.*;

public class CheckScore {
    public static void main(String[] args) {
        String[] logs = {"1901 10 50", "1909 10 50"};
        String[] result = solution(logs);

        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }

    private static String[] solution(String[] logs) {
        String[] answer = {};
        ArrayList<Student> list = new ArrayList<>();
        ArrayList<String> numberList = new ArrayList<>();
        ArrayList<String> student = new ArrayList<>();

        for (int i = 0; i < logs.length; i++) {
            String[] s = logs[i].split(" ");
            if (!numberList.contains(s[0])) {
                Map<String, Integer> map = new HashMap<>();
                map.put(s[1], Integer.parseInt(s[2]));
                list.add(new Student(s[0], map));
                numberList.add(s[0]);
            }
            else if(numberList.contains(s[0])) {
                list.get(numberList.indexOf(s[0])).map.put(s[1], Integer.parseInt(s[2]));
            }
        }

        for (int i = 0; i < list.size(); i++) {
            Student base = list.get(0);
            for (int j = 0; j < list.size(); j++) {
                if (i != j) {
                    Student diff = list.get(j);
                    if (base.map.size() == diff.map.size() && base.map.size() >= 5) {
                        boolean isTrue = true;
                        Iterator<String> iter = base.map.keySet().iterator();
                        Iterator<String> iter2 = diff.map.keySet().iterator();
                        while (iter.hasNext()) {
                            String s1 = iter.next();
                            String s2 = iter2.next();
                            if (s1.equals(s2)) {
                                if (base.map.get(s1) != diff.map.get(s1)) {
                                    isTrue = false;
                                    break;
                                }
                            }
                        }
                        if (isTrue) {
                            if (!student.contains(base.number)) {
                                student.add(base.number);
                            }
                            if (!student.contains(diff.number)) {
                                student.add(diff.number);
                            }
                        }
                    }
                }
            }
        }
        if (student.isEmpty()) {
            answer = new String[1];
            answer[0] = "None";
        }
        else {
            Collections.sort(student);
            answer = new String[student.size()];

            for (int i = 0; i < answer.length; i++) {
                answer[i] = student.get(i);
            }
        }

        return answer;
    }

    static class Student {
        String number;
        Map<String, Integer> map;
        public Student(String number, Map<String, Integer> map) {
            this.number = number;
            this.map = map;
        }
    }
}
