package jan_26_2024;

import java.util.ArrayList;
import java.util.List;

public class RateLimiter {
	private final static String PASS = "{status: 200, message: OK}";
	private final static String FAIL = "{status: 429, message: Too many requests}";

	public static void main(String[] args) {
		List<String> data = List.of(
			"www.abc.com",
			"www.hd.com",
			"www.abc.com",
			"www.pqr.com",
			"www.abc.com",
			"www.abc.com",
			"www.pqr.com",
			"www.pqr.com"
		);

		List<String> requests = new ArrayList<>(data);

		// List<String> requests = List.of(
		// 	"www.abc.com",
		// 	"www.abc.com",
		// 	"www.abc.com",
		// 	"www.abc.com"
		// );

		List<String> result = solution(requests);

		result.forEach(System.out::println);
	}

	private static List<String> solution(List<String> requests) {
		return checkRequest(requests);
	}

	private static List<String> checkRequest(List<String> requests) {
		List<String> result = new ArrayList<>();
		int limitCount = 2;
		int maxLimitCount = 5;
		int limitTime = 5;
		int maxLimitTime = 30;

		for (int i = 0; i < requests.size(); i++) {
			String current = requests.get(i);

			if (isOverLimit(requests, current, i, limitTime, limitCount)) {
				result.add(FAIL);
				requests.set(i, current + "_");
				continue;
			}

			if (isOverLimit(requests, current, i, maxLimitTime, maxLimitCount)) {
				result.add(FAIL);
				requests.set(i, current + "_");
				continue;
			}

			result.add(PASS);
		}

		return result;
	}

	private static boolean isOverLimit(List<String> requests, String request, int currentIndex, int limitTime, int limitCount) {
		List<String> subList = requests.subList(Math.max((currentIndex - limitTime + 1), 0), currentIndex);
		int count = (int)subList.stream()
			.filter(req -> req.equals(request))
			.count();

		return count >= limitCount;
	}
}
