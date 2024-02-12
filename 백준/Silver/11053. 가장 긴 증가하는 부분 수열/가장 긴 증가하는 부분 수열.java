
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N+1];
        int[] dp = new int[N+1];

        dp[1] = 1;
        for (int i = 1; i <= N; i++) {
            arr[i] = sc.nextInt();
            dp[i] = 1;
        }

        int max = 0;
        for (int i = 0; i <= N; i++) {
            for (int j = 1; j < i; j++) {
                if (arr[i]>arr[j]) dp[i] = Math.max(dp[i], dp[j] + 1);
            }
            max = Math.max(max, dp[i]);
        }

        System.out.println(max);

    }
}