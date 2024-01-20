import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N+1];
        int[] sum = new int[N+1];

        for (int i = 1; i <= N; i++) {
            arr[i] = sc.nextInt();
            sum[i] = sum[i - 1] + arr[i];
        }

        while (M-- > 0) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            int answer = (j == i) ? arr[j] : sum[j] - sum[i - 1];
            System.out.println(answer);
        }
    }
}