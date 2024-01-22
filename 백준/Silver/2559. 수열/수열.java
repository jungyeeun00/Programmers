import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] sum = new int[N];
        int[] answer = new int[N - K + 1];

        sum[0] = sc.nextInt();
        for (int i = 1; i < N; i++) {
            sum[i] = sum[i - 1] + sc.nextInt();
        }

        answer[0] = sum[K - 1];
        for (int i = 1; i < N - K + 1; i++) {
            answer[i] = sum[i + K - 1] - sum[i - 1];
        }

        int max = answer[0];
        for (int i = 1; i < N - K + 1; i++) {
            max = Math.max(max, answer[i]);
        }

        System.out.println(max);

    }
}