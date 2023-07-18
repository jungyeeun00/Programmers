import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int cnt = 0;
        int answer = 0;

        Arrays.sort(citations);
        for (int i = 0; i <= Arrays.stream(citations).max().getAsInt(); i++) {
            int j = i;
            cnt = (int) Arrays.stream(citations).filter(t -> t >= j).count();
            if (cnt >= i) answer=i;
        }
        return answer;
    }
}