import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        long[] sum = new long[N + 1];
        long[] remainArr = new long[M];
        long count = 0;

        for (int i = 1; i <= N; i++) {
            sum[i] = (sum[i - 1] + sc.nextInt()) % M;
            remainArr[(int) sum[i]]++;
            if (sum[i] == 0) count++;
        }

        for (int i = 0; i < M; i++) {
            if (remainArr[i] > 1) {
                count += remainArr[i] * (remainArr[i] - 1) / 2;
            }
        }

        System.out.println(count);

    }
}