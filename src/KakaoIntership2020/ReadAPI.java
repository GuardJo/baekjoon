package KakaoIntership2020;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;

public class ReadAPI {
    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String statusQuery = br.readLine();
        int parentId = Integer.parseInt(br.readLine());
        int result = solution(statusQuery, parentId);

        bw.write(result + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    private static int solution(String statusQuery, int parentId) throws IOException, SAXException, ParserConfigurationException {
        int answer = 0;
        for (int i = 0; i < 5; i++) {
            String url = "https://jsonmock.hackerrank.com/api/iot_devices/search?status=" + statusQuery + "&page=" + i;
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(url);

            doc.getDocumentElement().normalize();
            System.out.println("Root" + doc.getDocumentElement().getNodeName());
        }

        return answer;
    }
}
