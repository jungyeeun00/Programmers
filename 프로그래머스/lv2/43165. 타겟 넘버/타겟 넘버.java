class Solution {
    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        
        return answer;
    }

    static int answer = 0;
    public static void dfs(int[] numbers, int target, int sum, int idx) {
        if (idx == numbers.length && target == sum) {
            answer++;
            return;
        }

        if (idx >= numbers.length) return;

        dfs(numbers, target, sum + numbers[idx], idx + 1);
        dfs(numbers, target, sum - numbers[idx], idx + 1);
    }
}