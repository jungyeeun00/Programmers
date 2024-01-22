import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] dp = new int[N];
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        dp[0] = arr[0];
        if (N == 1) {
            System.out.println(dp[N - 1]);
            return;
        }
        dp[1] = dp[0] + arr[1];
        if (N == 2) {
            System.out.println(dp[N - 1]);
            return;
        }
        dp[2] = Math.max(arr[0] + arr[2], arr[1] + arr[2]);
        if (N == 3) {
            System.out.println(dp[N - 1]);
            return;
        }
        for (int i = 3; i < N; i++) {
            dp[i] = Math.max(dp[i - 3] + arr[i - 1], dp[i - 2]) + arr[i];
        }

        System.out.println(dp[N - 1]);

    }
}