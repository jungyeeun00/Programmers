import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[501];
        int[] lis = new int[501];

        for (int i = 0; i < N; i++) {
            arr[sc.nextInt()] = sc.nextInt();
        }

        for (int i = 0; i <= 500; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > 0 && arr[i] > arr[j]) {
                    lis[i] = Math.max(lis[j] + 1, lis[i]);
                }
            }
        }

        int answer = 0;
        for (int i = 0; i <= 500; i++) {
            answer = Math.max(answer, lis[i]);
        }
        System.out.println(N - answer);
    }
}