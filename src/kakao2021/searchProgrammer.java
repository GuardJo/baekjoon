package kakao2021;

public class searchProgrammer {
    public static void main(String[] args) {
        String[] info = {"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"};
        String[] query = {"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"};
        int[] result = solution(info, query);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }

    private static int[] solution(String[] info, String[] query) {
        int[] answer = new int[query.length];
        for (int i = 0; i < query.length; i++) {
            String[] str = query[i].split(" ");
            answer[i] = find(str[0], str[2], str[4], str[6], Integer.parseInt(str[7]), info);
        }
        return answer;
    }

    private static int find(String lang, String job, String exp, String food, int score, String[] info) {
        int result = 0;
        String[][] infoArr = new String[info.length][info[0].length()];
        for (int i = 0; i < infoArr.length; i++) {
            String[] str = info[i].split(" ");
            if ((str[0].equals(lang) || lang.equals("-")) && (str[1].equals(job) || job.equals("-")) && (str[2].equals(exp) || exp.equals("-")) && (str[3].equals(food) || food.equals("-")) && (Integer.parseInt(str[4]) >= score)) {
                result++;
            }
        }
        return result;
    }
}
