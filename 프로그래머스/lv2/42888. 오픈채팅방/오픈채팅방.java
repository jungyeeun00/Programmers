import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        List<String> list = new ArrayList<>();
        Map<String, String> userId = new HashMap<>(); //ID, NAME

        for (String s :
                record) {
            String[] arr = s.split(" ");
            switch (arr[0]) {
                case "Enter":
                case "Change":
                    userId.put(arr[1], arr[2]);
                    break;
            }
        }

        for (String s :
                record) {
            String[] arr = s.split(" ");
            switch (arr[0]) {
                case "Enter":
                    list.add(userId.get(arr[1]) + "님이 들어왔습니다.");
                    break;
                case "Leave":
                    list.add(userId.get(arr[1]) + "님이 나갔습니다.");
                    break;
            }
        }
        String[] answer = new String[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}