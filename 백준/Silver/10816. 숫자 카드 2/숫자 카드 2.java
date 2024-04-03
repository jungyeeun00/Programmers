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
//        int[] arr_N = new int[N];
        HashMap<Integer, Integer> map = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int key = Integer.parseInt(st.nextToken());
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
//        long[] arr_M = new long[M];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            int key = Integer.parseInt(st.nextToken());
            sb.append(map.getOrDefault(key, 0)).append(" ");
        }

        System.out.println(sb);

    }

}