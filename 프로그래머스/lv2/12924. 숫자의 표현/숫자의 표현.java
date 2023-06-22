class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            int num = i, sum = 0;
            while (sum<n){
                sum += num;
                if (sum==n){
                    answer++;
                    break;
                }
                num++;
            }
        }
        return answer;
    }
}