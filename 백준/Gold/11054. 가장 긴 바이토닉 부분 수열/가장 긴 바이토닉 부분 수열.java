import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] lisR = new int[N];
        int[] lisL = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int max = 0;
        for (int i = 0; i < N; i++) {
            lisR[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    lisR[i] = Math.max(lisR[j] + 1, lisR[i]);
                }
            }
        }
        for (int i = N - 1; i >= 0; i--) {
            lisL[i] = 1;
            for (int j = N - 1; j > i; j--) {
                if (arr[i] > arr[j]) {
                    lisL[i] = Math.max(lisL[j] + 1, lisL[i]);
                }
            }
        }

        for (int i = 0; i < N; i++) {
            max = Math.max(max, lisL[i] + lisR[i]);
        }

        System.out.println(max-1);
    }
}