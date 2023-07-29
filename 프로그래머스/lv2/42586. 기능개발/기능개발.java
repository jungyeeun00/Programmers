import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < progresses.length; i++) {
            double remain = (double)(100 - progresses[i]) / speeds[i];
            int date = (int) Math.ceil(remain);

            if (!queue.isEmpty() && queue.peek() < date) {
                list.add(queue.size());
                queue.clear();
            }

            queue.add(date);
        }

        list.add(queue.size());

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}