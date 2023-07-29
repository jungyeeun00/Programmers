import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();

        List<Integer> list = new ArrayList<>();
        int idx = 0;
        int cnt = 0;
        for (int progress : progresses) {
            queue.add(progress);
        }
        while (!queue.isEmpty()) {
            while (queue.peek()+speeds[idx]*cnt<100){
                cnt++;
            }
            int answer = 0;
            while (queue.peek()+speeds[idx]*cnt>=100){
                queue.poll();
                answer++;
                idx++;
                if (queue.isEmpty()) break;
            }
            list.add(answer);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}