import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> answer = new ArrayList<>();
        for (int i=0;i<numbers.length-1;i++){
            for(int j=i+1;j< numbers.length;j++){
                if (!answer.isEmpty()&&answer.contains(numbers[i]+numbers[j])) continue;
                answer.add(numbers[i] + numbers[j]);
            }
        }
        Collections.sort(answer);
        return answer.stream().mapToInt(i->i).toArray();
    }
}