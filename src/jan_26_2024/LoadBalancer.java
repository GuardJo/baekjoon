package jan_26_2024;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class LoadBalancer {
	public static void main(String[] args) {
		int n = 4;
		List<Integer> arrival = List.of(3, 5, 1, 6, 8);
		List<Integer> burstTime = List.of(9, 2, 10, 4, 5);

		// List<Integer> arrival = List.of(2, 2, 2, 3);
		// List<Integer> burstTime = List.of(1, 3, 1, 2);

		List<Integer> answer = solution(n, arrival, burstTime);

		answer.forEach(System.out::println);
	}

	private static List<Integer> solution(int n, List<Integer> arrival, List<Integer> burstTime) {
		List<Server> servers = makeServer(n);
		List<Request> requests = makeRequest(arrival, burstTime);
		requests.stream()
			.sorted(Comparator.comparing(Request::getArrival))
			.forEach(request -> {
				Server selected = selectServer(request, servers);

				if (Objects.isNull(selected)) {
					request.setSelectServerNumber(-1);
				} else {
					selected.setFinishedTime(request.getArrival() + request.getBurstTime());
					request.setSelectServerNumber(selected.getNumber());
				}
			});

		return requests.stream()
			.mapToInt(Request::getSelectServerNumber)
			.boxed()
			.collect(Collectors.toList());
	}

	private static Server selectServer(Request request, List<Server> servers) {
		return servers.stream()
			.filter(server -> !server.isRunning(request.getArrival()))
			.findFirst()
			.orElse(null);
	}

	private static List<Server> makeServer(int n) {
		List<Server> servers = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			servers.add(new Server(i + 1));
		}

		return servers;
	}

	private static List<Request> makeRequest(List<Integer> arrival, List<Integer> burstTime) {
		List<Request> requests = new ArrayList<>();
		for (int i = 0; i < arrival.size(); i++) {
			requests.add(new Request(i + 1, arrival.get(i), burstTime.get(i)));
		}

		return requests;
	}

	static class Request {
		private final int index;
		private final int arrival;
		private final int burstTime;
		private int selectServerNumber = 0;

		public Request(int index, int arrival, int burstTime) {
			this.index = index;
			this.arrival = arrival;
			this.burstTime = burstTime;
		}

		public int getIndex() {
			return index;
		}

		public int getArrival() {
			return arrival;
		}

		public int getBurstTime() {
			return burstTime;
		}

		public int getSelectServerNumber() {
			return selectServerNumber;
		}

		public void setSelectServerNumber(int selectServerNumber) {
			this.selectServerNumber = selectServerNumber;
		}
	}

	static class Server {
		private final int number;
		private int finishedTime = 0;

		public Server(int number) {
			this.number = number;
		}

		public void setFinishedTime(int finishedTime) {
			this.finishedTime = finishedTime;
		}

		public int getNumber() {
			return number;
		}

		public int getFinishedTime() {
			return finishedTime;
		}

		public boolean isRunning(int time) {
			return this.finishedTime > time;
		}
	}
}
