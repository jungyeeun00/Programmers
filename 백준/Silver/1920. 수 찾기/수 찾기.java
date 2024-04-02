import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        long[] arr_N = new long[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr_N[i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        long[] arr_M = new long[M];

        Arrays.sort(arr_N);
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            arr_M[i] = Long.parseLong(st.nextToken());
            sb.append(binarySearch(arr_N, arr_M[i])).append("\n");
        }

        System.out.println(sb);

    }

    public static int binarySearch(long[] arr, long key) {
        int start = 0, last = arr.length - 1;

        while (start<=last) {
            int idx = (start + last) / 2;
            if (arr[idx] > key) {
                last = idx - 1;
            } else if (arr[idx] < key) {
                start = idx + 1;
            } else {
                return 1;
            }
        }

        return 0;
    }

}