import java.util.*;
class Solution {
    public int solution(int n) {
        int answer=0;
        int []prime = new int[n+1];

        for (int i = 0; i <= n; i++) {
            prime[i] = i;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (prime[i]==i){
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = 0;
                }
            }
        }
        
        for(int i=0;i<prime.length;i++){
            if(prime[i]>1) answer++;
        }

        return answer;
    }
}