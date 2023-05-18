import java.util.stream.*;
class Solution {
    public int solution(int[] a, int[] b) {
        // int answer = 0;
        // for(int i=0;i<a.length;i++){
        //     answer+=a[i]*b[i];
        // }
        // return answer;
        
        return IntStream.range(0, a.length).map(i->a[i]*b[i]).sum();
    }
}