import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] dp = new int[N];
        dp[0] = 1;
        if (N>=2) dp[1] = 2;
        for (int i = 2; i < N; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2])%15746;
        }
        System.out.println(dp[N-1]);



    }

}