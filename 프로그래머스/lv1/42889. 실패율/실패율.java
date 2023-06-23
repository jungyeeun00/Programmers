import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(int N, int[] stages) {
        Map<Integer, Double> map = new HashMap<>();
        int[] answer = new int[N];
        double challengers=stages.length;
        // int max = Math.min(N, Arrays.stream(stages).max().getAsInt());
        int max = N;
        for (int i = 1; i <= max; i++) {
            double fails = 0;
            for (int j = 0; j < stages.length; j++) {
                if (stages[j]==0) continue;
                if (stages[j]!=0) stages[j]--;
                if (stages[j]==0) fails++;
            }
            if (challengers==0) challengers = 1;
            map.put(i, fails / challengers);
            System.out.println((int)fails+", "+(int)challengers);
            challengers-=fails;
        }
        List<Map.Entry<Integer, Double>> list = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue((o1, o2) -> Double.compare(o2, o1)))
                .collect(Collectors.toList());
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i).getKey();
        }
        return answer;
    }
}