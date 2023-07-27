import java.util.*;
class Solution {
    public int[] solution(String s) {
        String[] arr = s.replace("{", "").replace("}}", "").split("},");
        Arrays.sort(arr, (o1, o2) -> o1.length()-o2.length());
        Set<Integer> set = new HashSet<>();
        int[] answer = new int[arr.length];
        int idx = 0;
        for (String s1 : arr) {
            String[] tuple = s1.split(",");
            for (String s2 : tuple) {
                int a1 = Integer.parseInt(s2);
                if (set.add(a1)) answer[idx++] = a1;
            }
        }
        return answer;
    }
}