import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] w = new int[N + 1];
        int[] v = new int[N + 1];
        int[][] dp = new int[K + 1][N + 1];

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            w[i] = Integer.parseInt(st.nextToken());
            v[i] = Integer.parseInt(st.nextToken());
        }

        for (int j = 1; j <= K; j++) {
            for (int i = 1; i <= N; i++) {
                dp[j][i] = dp[j][i - 1];
                if (w[i] <= j) {
                    dp[j][i] = Math.max(dp[j][i - 1], v[i] + dp[j - w[i]][i - 1]);
                }
            }
        }

        System.out.println(dp[K][N]);
    }
}