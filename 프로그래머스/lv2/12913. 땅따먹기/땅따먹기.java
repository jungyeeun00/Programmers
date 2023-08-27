import java.util.*;
class Solution {
    int solution(int[][] land) {
        for (int i = 1; i < land.length; i++) {
            land[i][0] += max(land[i - 1][1], land[i - 1][2], land[i - 1][3]);
            land[i][1] += max(land[i - 1][0], land[i - 1][2], land[i - 1][3]);
            land[i][2] += max(land[i - 1][0], land[i - 1][1], land[i - 1][3]);
            land[i][3] += max(land[i - 1][0], land[i - 1][1], land[i - 1][2]);
        }

        return Arrays.stream(land[land.length-1]).max().getAsInt();
    }
    
    public static int max(int a, int b, int c){
        return Math.max(a, Math.max(b, c));
    }
}