import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        int[][] user = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        List<Integer> score = new ArrayList<>(Arrays.asList(0, 0, 0));
        
        for(int i=0;i<answers.length;i++){
            if(user[0][i%user[0].length]==answers[i]){
                int n = score.get(0)+1;
                score.set(0, n);
            }
            if(user[1][i%user[1].length]==answers[i]){
                int n = score.get(1)+1;
                score.set(1, n);
            }
            if(user[2][i%user[2].length]==answers[i]){
                int n = score.get(2)+1;
                score.set(2, n);
            }
        }
        
        int max = Collections.max(score);
        for(int i=0;i<score.size();i++){
            if(max == score.get(i))
                answer.add(i+1);
        }
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}
