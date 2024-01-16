import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        long dp[] = new long[N+1];
        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        dp[1] = arr[0];
        long max = dp[1];

        for (int i=1;i<=N;i++) {
            dp[i] = Math.max(arr[i-1], arr[i-1]+dp[i-1]);
            max = Math.max(dp[i], max);
        }

        System.out.println(max);

    }
}