import java.util.*;
class Solution {
    public int[] solution(int[] fees, String[] records) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        for (String record : records) {
            String[] arr = record.split(" ");
            int add = arr[2].equals("IN") ? -1 : 1;
            String[] times = arr[0].split(":");
            int time = Integer.parseInt(times[0]) * 60 + Integer.parseInt(times[1]);
            treeMap.put(arr[1], treeMap.getOrDefault(arr[1], 0) + time * add);
        }

        int[] answer = new int[treeMap.size()];
        int idx = 0;
        for (int time : treeMap.values()) {
            if (time <= 0) {
                time += 60 * 23 + 59;
            }
            int fee;
            if (time <= fees[0]) {
                fee = fees[1];
            } else {
                fee = (int) (fees[1] + Math.ceil((double) (time - fees[0]) / fees[2]) * fees[3]);
            }
            answer[idx++] = fee;
        }
        return answer;
    }
}