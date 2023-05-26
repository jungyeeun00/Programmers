class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int max = 0, min = 0;
        if(m>=n){
            max = m;
            min = n;
        } else {
            max = n;
            min = m;
        }
        int r = min;
        while(r!=0){
            r = max%min;
            if(r==0) break;
            max = min;
            min = r;
        }
        answer[0]=min;
        answer[1]=(n*m)/answer[0];
        
        return answer;
    }
}