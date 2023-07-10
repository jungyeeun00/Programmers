import java.util.Arrays;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Arrays.sort(tangerine);
        int[] count = new int[Arrays.stream(tangerine).max().getAsInt()+1];
        for (int i = 0; i < tangerine.length; i++) {
            count[tangerine[i]]++;
        }
        Arrays.sort(count);
        int sum=0;
        for (int i = count.length-1; i >= 0; i--) {
            if (sum>=k) break;
            if (count[i]==0) continue;
            answer++;
            sum += count[i];
        }
        return answer;
    }
}