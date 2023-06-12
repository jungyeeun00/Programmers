import java.util.Arrays;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        // int []sortedScore = Arrays.stream(score).sorted().toArray();
        // int idx = 0;
        // for (int i = sortedScore.length-1; i >= 0; i--) {
        //     idx++;
        //     if (idx%m==0) answer += sortedScore[i] * m;
        // }
        
        Arrays.sort(score);
        for(int i=score.length;i>=m;i-=m){
            answer+=score[i-m]*m;
        }
        return answer;
    }
}