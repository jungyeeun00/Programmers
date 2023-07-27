import java.util.*;
class Solution {
    public int[] solution(String s) {
        s = s.replace("{", "").replace("}}", "");
        String[] arr = s.split("},");
        Arrays.sort(arr, (o1, o2) -> o1.length()-o2.length());
        List<Integer> answer = new ArrayList<>();
        for (String s1 : arr) {
            String[] tuple = s1.split(",");
            for (String s2 : tuple) {
                int a1 = Integer.parseInt(s2);
                if (answer.contains(a1)) continue;
                else answer.add(a1);
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}