import java.util.*;
class Solution {
    public int[] solution(int[] fees, String[] records) {
        HashMap<String, Stack> map = new HashMap<>();
        HashMap<String, Integer> car = new HashMap<>();

        for (String record : records) {
            String [] arr = record.split(" ");
            if (arr[2].equals("IN")) {
                if (map.containsKey(arr[1])) {
                    Stack<Integer> stack = map.get(arr[1]);
                    String[] time = arr[0].split(":");
                    int minutes = Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]);
                    stack.push(minutes);
                    map.replace(arr[1], stack);
                } else {
                    Stack<Integer> stack = new Stack<>();
                    String[] time = arr[0].split(":");
                    int minutes = Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]);
                    stack.push(minutes);
                    map.put(arr[1], stack);
                }
            } else {
                Stack<Integer> stack = map.get(arr[1]);
                int prev = stack.pop();
                String[] time = arr[0].split(":");
                int next = Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]);
                if (car.containsKey(arr[1])) {
                    car.replace(arr[1], car.get(arr[1]) + (next - prev));
                } else {
                    car.put(arr[1], next - prev);
                }
            }
        }

        for (String s : map.keySet()) {
            if (!map.get(s).isEmpty()) {
                int prev = (int) map.get(s).pop();
                int next = 23 * 60 + 59;
                if (car.containsKey(s)) {
                    car.replace(s, car.get(s) + (next - prev));
                } else {
                    car.put(s, next - prev);
                }
            }
        }

        String[] cars = new String[car.size()];

        int idx = 0;
        for (String s : car.keySet()) {
            cars[idx++] = s;
            int time = car.get(s);
            int fee;
            if (time <= fees[0]) {
                fee = fees[1];
            } else {
                fee = (int) (fees[1] + Math.ceil((double) (time - fees[0]) / fees[2]) * fees[3]);
            }
            car.replace(s, fee);
        }
        Arrays.sort(cars);
        int[] answer = new int[car.size()];

        for (int i = 0; i < cars.length; i++) {
            answer[i] = car.get(cars[i]);
        }
        return answer;
    }
}