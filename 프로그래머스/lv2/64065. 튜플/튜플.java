import java.util.*;
class Solution {
    public int[] solution(String s) {
        String[] arr = s.replace("{", "").replace("}}", "").split("},");
        Arrays.sort(arr, (o1, o2) -> o1.length()-o2.length());
        Set<String> set = new HashSet<>();
        int[] answer = new int[arr.length];
        int idx = 0;
        for (String s1 : arr) {
            for (String s2 : s1.split(",")) {
                if (set.add(s2)) answer[idx++] = Integer.parseInt(s2);
            }
        }
        return answer;
    }
}