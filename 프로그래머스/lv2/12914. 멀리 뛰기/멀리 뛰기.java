class Solution {
    public long solution(int n) {
        long []answer = new long[n+1];
        if(n==1) return 1;
        else if(n==2) return 2;
        answer[0]=1;
        answer[1]=1;
        for(int i=2;i<=n;i++){
            answer[i]=(answer[i-1]+answer[i-2])%1234567;
        }
        
        return answer[n];
    }
}