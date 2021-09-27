import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
                int zero_cnt=0;
        for(int i:lottos){
            if (i==0)
                zero_cnt++;
        }
        
        long check_cnt = Arrays.stream(lottos).filter(it-> CheckLottos(it, win_nums)).count();

        answer[0] = (check_cnt + zero_cnt == 0) ? 6:7 - (int) (check_cnt + zero_cnt);
        answer[1] = (check_cnt==0) ? 6 : (int) (7-check_cnt);

        return answer;
    }
    
    static boolean CheckLottos(int num, int[] win_nums){
        for (int i :
                win_nums) {
            if(num==i) return true;
        }
        return false;
    }

}
