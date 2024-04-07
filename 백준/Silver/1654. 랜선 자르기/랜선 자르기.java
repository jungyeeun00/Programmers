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
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        long length = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
            length = Math.max(arr[i], length);
        }

        long start = 0, last = length + 1;
        while (start < last) {
            long mid = (start + last) / 2;
            long cnt = 0;
            for (int i = 0; i < N; i++) {
                cnt += (arr[i] / mid);
            }

            if (cnt < K) {
                last = mid;
            } else {
                start = mid + 1;
            }
        }

        System.out.println(last - 1);

    }

}