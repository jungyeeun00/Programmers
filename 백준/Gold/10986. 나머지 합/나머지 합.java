import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        long[] remain = new long[M];
        long[] sum = new long[N + 1];
        long count = 0;

        for (int i = 1; i <= N; i++) {
            sum[i] = sum[i - 1] + sc.nextInt();
            if ((int)(sum[i] % M) == 0) {
                count++;
            }
            remain[(int) (sum[i] % M)]++;
        }

        for (int i = 0; i < M; i++) {
            if(remain[i]>=2)
                count += remain[i] * (remain[i] - 1) / 2;
        }

        System.out.println(count);


    }
}