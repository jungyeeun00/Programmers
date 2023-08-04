import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int priority : priorities) {
            queue.add(priority);
        }

        Arrays.sort(priorities);
        int l = location;

        while (!queue.isEmpty()) {
            int i = queue.poll();
            if (i == priorities[priorities.length - 1 - answer]) {
                answer++;
                l--;
                if (l < 0) {
                    return answer;
                }
            } else {
                queue.add(i);
                l--;
                if (l < 0) {
                    l = queue.size() - 1;
                }
            }
        }
        
        return answer;
    }
}