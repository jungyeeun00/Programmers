import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i : scoville) {
            pq.add(i);
        }

//         while (true) {
//             if (pq.stream().noneMatch(t->t<K))
//                 break;
//             if (pq.isEmpty()) return -1;
//             int first = pq.poll();
//             if (pq.isEmpty()) return -1;
//             int second = pq.poll();
//             int mix = first + (second * 2);
//             answer++;
//             pq.add(mix);


//         }
        
//         if (pq.peek()<K) return -1;
        
        while (pq.size() > 1 && pq.peek() < K) {
            int first = pq.poll();
            int second = pq.poll();
            int mix = first + (second * 2);
            answer++;
            pq.add(mix);
        }

        if (pq.size() == 1 && pq.peek() < K) return -1;
        return answer;
    }
}