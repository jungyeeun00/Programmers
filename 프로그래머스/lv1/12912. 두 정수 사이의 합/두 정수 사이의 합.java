class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        // int sub = Math.abs(a-b);
        // int min = Math.min(a, b);
        // while(sub>=0){
        //     answer+=min++;
        //     sub--;
        // }
        for(int i=(a>b?b:a);i<=(a>b?a:b);i++)
            answer+=i;
        
        return answer;
    }
}