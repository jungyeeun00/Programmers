import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int[] dp = new int[N + 1];
        int max = dp[1] = arr[0];
        for (int i = 2; i <= N; i++) {
            dp[i] = Math.max(dp[i - 1] + arr[i - 1], arr[i - 1]);
            max = Math.max(dp[i], max);
        }

        System.out.println(max);

    }
}