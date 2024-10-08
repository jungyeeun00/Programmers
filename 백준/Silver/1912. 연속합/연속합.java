import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        long[] dp = new long[N];

        dp[0] = arr[0];
        long max = dp[0];
        for (int i = 1; i < N; i++) {
            dp[i] = Math.max(arr[i], dp[i - 1] + arr[i]);
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);



    }

}