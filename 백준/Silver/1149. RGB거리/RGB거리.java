import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] dp = new int[N][3];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                dp[i][j] = sc.nextInt();
                if (i==0) continue;
                if (j == 0) {
                    dp[i][j] += Math.min(dp[i - 1][1], dp[i - 1][2]);
                } else if (j == 1) {
                    dp[i][j] += Math.min(dp[i - 1][0], dp[i - 1][2]);
                } else {
                    dp[i][j] += Math.min(dp[i - 1][0], dp[i - 1][1]);
                }
            }
        }

        int min = Math.min(Math.min(dp[N - 1][0], dp[N - 1][1]), dp[N - 1][2]);

        System.out.println(min);

    }
}