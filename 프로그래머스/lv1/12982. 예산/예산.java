import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int[] sorted = Arrays.stream(d).sorted().toArray();
        int sum = 0, answer = 0;
        for (int i = 0; i < sorted.length; i++) {
            sum += sorted[i];
            if(sum<=budget) answer = i+1;
            else break;
        }
        return answer;
    }
}  