import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine());

        long dp[] = new long[101];
        dp[1]=dp[2]=dp[3]=1;
        dp[4]=dp[5]=2;
        for (int i = 6; i <= 100; i++) {
            dp[i] = dp[i - 1] + dp[i - 5];
        }

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            System.out.println(dp[N]);
        }

    }

}