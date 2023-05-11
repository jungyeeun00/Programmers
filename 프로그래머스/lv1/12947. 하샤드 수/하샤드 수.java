class Solution {
    public boolean solution(int x) {        
        int res = x;
        int sum = 0;
        
        while(res>0){
            sum+=res%10;
            res/=10;
        }
                
        return x%sum==0;
    }
}