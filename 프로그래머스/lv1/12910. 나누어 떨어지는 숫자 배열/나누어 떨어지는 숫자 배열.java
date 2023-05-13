import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();
        for (int j : arr) {
            if (j % divisor == 0) {
                answer.add(j);
            }
        }
        if(answer.size()==0) answer.add(-1);
        return answer.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}