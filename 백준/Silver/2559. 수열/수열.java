import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] sum = new int[N];
        sum[0] = sc.nextInt();
        for (int i = 1; i < N; i++) {
            sum[i] = sum[i - 1] + sc.nextInt();
        }

        int[] answer = new int[N - K + 1];
        int max = answer[0] = sum[K - 1];
        for (int i = 1; i < answer.length; i++) {
            answer[i] = sum[i + K - 1] - sum[i - 1];
            max = Math.max(answer[i], max);
        }

        System.out.println(max);

    }
}