class Solution {
    public int[] solution(int brown, int yellow) {
        // int[] answer = {0, 0};
        // for(int i=3;i<brown+yellow/2;i++){
        //     if((brown+yellow)%i==0){
        //         answer[1]=i;
        //         answer[0] = brown / 2 + 2 - answer[1];
        //         if(answer[1]*answer[0]==brown+yellow)
        //             return answer;
        //     }
        // }
        // return answer;
        
        int a = brown/2+2;
        int b = brown+yellow;
        
        return new int[]{(int)(a+Math.sqrt(a*a-4*b))/2, (int)(a-Math.sqrt(a*a-4*b))/2};
    }
}