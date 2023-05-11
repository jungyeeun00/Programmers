import java.util.*;
class Solution {
    public boolean solution(int x) {
        List<Integer> list = new ArrayList<>();
        
        int res = x;
        while(res>0){
            list.add(res%10);
            res/=10;
        }
        
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        
        return x%sum==0;
    }
}