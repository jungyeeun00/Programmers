class Solution {
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        dfs(k, dungeons, visited);
        return max;
    }
    int max = Integer.MIN_VALUE;
    public void dfs(int k, int[][] dungions, boolean[] visited) {
        int count = 0;
        for (int i = 0; i < visited.length; i++) {
            if (visited[i]) count++;
        }
        if (count>max) max = count;

        for (int i = 0; i < dungions.length; i++) {
            if (!visited[i] && dungions[i][0] <= k) {
                visited[i] = true;
                k -= dungions[i][1];
                dfs(k, dungions, visited);
                k += dungions[i][1];
                visited[i] = false;
            }
        }
    }
}