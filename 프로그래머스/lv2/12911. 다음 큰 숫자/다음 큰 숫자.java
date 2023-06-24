class Solution {
    public int solution(int n) {
        int answer = n;
        int cnt = Integer.bitCount(n);

        while (true){
            answer++;
            int count = Integer.bitCount(answer);
            if (cnt==count) break;
        }
        return answer;
    }
}