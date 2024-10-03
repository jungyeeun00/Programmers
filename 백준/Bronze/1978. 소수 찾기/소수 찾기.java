import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        boolean[] prime = new boolean[1001];    //소수는  false

        prime[0] = true;
        prime[1] = true;

        for (int i = 2; i <= Math.sqrt(1000); i++) {
            if (!prime[i]) {    //prime[i]가 소수라면
                for (int j = i*i; j <= 1000; j+=i) {  //prime[j]는 소수가 아님
                    prime[j] = true;
                }
            }
        }

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(st.nextToken());
            if (!prime[n]) cnt++;
        }

        System.out.println(cnt);
    }
}