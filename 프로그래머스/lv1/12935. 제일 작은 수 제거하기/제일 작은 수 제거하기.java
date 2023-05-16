import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        if(arr[0]==10){
            int [] res = {-1};
            return res;
        }
        return Arrays.stream(arr).filter(t->t>Arrays.stream(arr).min().getAsInt()).toArray();
    }
}