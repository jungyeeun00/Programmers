import java.util.*;
class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder str = new StringBuilder();
        String answer = "";

        for (int i = 0; i < t * m; i++) {
            str.append(Integer.toString(i, n));
        }

        for (int i = 0; t > 0; i += m, t--) {
            answer += Character.toUpperCase(str.charAt((p - 1) + i));
        }        
        return answer;
    }
}