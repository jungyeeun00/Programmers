import java.util.*;

public class Main {
    static long dp[] = new long[1000001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        dp[1] = 1;
        dp[2] = 2;

        int n = sc.nextInt();

        for (int i=3;i<=n;i++){
            dp[i] = (dp[i - 1] + dp[i - 2])%15746;
        }

        System.out.println(dp[n]);
    }


}