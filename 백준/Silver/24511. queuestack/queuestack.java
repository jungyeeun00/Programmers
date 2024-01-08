import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int []A = new int[N];
        int[] B = new int[N];

        for(int i=0;i<N;i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            B[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        int[] C = new int[M + N];

        int idx=0;
        for(int i=N-1;i>=0;i--){
            if (A[i]==0) C[idx++] = B[i];
        }

        int output=0;
        st = new StringTokenizer(br.readLine());
        while (M-->0){
            C[idx++] = Integer.parseInt(st.nextToken());
            sb.append(C[output++]).append(" ");
        }

        System.out.println(sb);

    }
}