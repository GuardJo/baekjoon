package WooahanTechCourse3;

public class DataToPacking {
    public static void main(String[] args) {
        String penter = "1100";
        String pexit = "0010";
        String pescape = "1001";
        String data = "1101100100101111001111000000";
        String result = solution(penter, pexit, pescape, data);

        System.out.println(result);
    }

    private static String solution(String penter, String pexit, String pescape, String data) {
        String answer = "";
        answer += penter;

        for (int i = 0; i < data.length(); i+=penter.length()) {
            String s = data.substring(i, i + penter.length());
            if (s.equals(penter) || s.equals(pescape) || s.equals(pexit)) {
                answer += (pescape + s);
            }
            else {
                answer += s;
            }
        }

        answer += pexit;
        return answer;
    }
}
