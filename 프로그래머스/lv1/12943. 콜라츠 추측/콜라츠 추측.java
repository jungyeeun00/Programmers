class Solution {
    public int solution(int n) {
        int answer = 0;
        long num = Long.valueOf(n);
        while(num>1){
            answer++;
            if(answer==500){
                answer=-1;
                break;
            }
            if(num%2==0){
                num/=2;
            }else{
                num=num*3+1;
            }
        }
        
        return answer;
    }
}