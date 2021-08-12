import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        for(int j=0;j<moves.length;j++){
            int idx = --moves[j];
            for(int i=0;i<board.length;i++){
                if(board[i][idx]!=0){
                    int doll = board[i][idx];
                    if(!st.isEmpty()&&doll==st.peek()) {
                        answer+=2;
                        st.pop();
                    }
                    else st.push(doll);

                    board[i][idx]=0;
                    break;
                }
            }
        }
        return answer;
    }
}
