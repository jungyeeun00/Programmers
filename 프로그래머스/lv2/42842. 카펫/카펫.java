class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {0, 0};
        for(int i=3;i<brown+yellow/2;i++){
            if((brown+yellow)%i==0){
                answer[1]=i;
                answer[0] = brown / 2 + 2 - answer[1];
                if(answer[1]*answer[0]==brown+yellow)
                    return answer;
            }
        }
        return answer;
    }
}