import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] dp = new int[N + 1];

//        if (N <= 1) {
//            System.out.println(0);
//            return;
//        }
        dp[0] = dp[1] = 0;
//        dp[2] = dp[3] = 1;
        for (int i = 2; i <= N; i++) {
            if (i % 6 == 0) {
                dp[i] = Math.min(dp[i / 2], dp[i / 3]) + 1;
            } else if (i % 3 == 0) {
                dp[i] = Math.min(dp[i - 1], dp[i / 3]) + 1;
            } else if (i % 2 == 0) {
                dp[i] = Math.min(dp[i - 1], dp[i / 2]) + 1;
            } else {
                dp[i] = dp[i - 1] + 1;
            }
        }

        System.out.println(dp[N]);

    }
}