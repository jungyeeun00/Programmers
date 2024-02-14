import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[][] board = new int[N + 1][M + 1];

        boolean color = false; //false=검은색, true=흰색
        //첫칸이 검정색일 경우
        for (int i = 1; i <= N; i++) {
            String str = br.readLine();
            for (int j = 1; j <= M; j++) {
                char c = str.charAt(j - 1);
                if (!color && c == 'W') { //검정 차례인데 흰색이면 변경횟수+1
                    board[i][j] = 1;
                } else if (color && c == 'B') { //흰색 차례인데 검정이면 변경+1
                    board[i][j] = 1;
                }
                color = !color;
            }
            if (M % 2 == 0) {
                color = !color;
            }
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                board[i][j] += board[i][j - 1];
            }
        }

        for (int i = 1; i <= M; i++) {
            for (int j = 1; j <= N; j++) {
                board[j][i] += board[j - 1][i];
            }
        }

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = K; i <= N; i++) {
            for (int j = K; j <= M; j++) {
                int cnt = board[i][j] - (board[i - K][j] + board[i][j - K] - board[i - K][j - K]);
                min = Math.min(cnt, min);
                max = Math.max(cnt, max);
            }
        }

        int answer = Math.min(min, K * K - max);
        System.out.println(answer);
    }
}