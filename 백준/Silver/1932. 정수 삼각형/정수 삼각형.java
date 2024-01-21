import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        long[][] dp = new long[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i+1; j++) {
                dp[i][j] = sc.nextInt();
                if (i==0) continue;
                if (j == 0) {
                    dp[i][j] += dp[i - 1][0];
                } else if (j == i) {
                    dp[i][j] += dp[i - 1][j - 1];
                } else {
                    dp[i][j] += Math.max(dp[i - 1][j], dp[i - 1][j - 1]);
                }
            }
        }

        long max = dp[N - 1][0];
        for (int i = 1; i < dp[N-1].length; i++) {
            max = Math.max(dp[N - 1][i], max);
        }
        System.out.println(max);

    }
}