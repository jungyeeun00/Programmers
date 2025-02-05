import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        int M = N - 1;

        int copyM, sum = 0;

        for (int i = 1; i <= M; i++) {
            sum = copyM = i;
            while (copyM > 0) {
                sum += (copyM % 10);
                copyM /= 10;
            }
            if (sum == N) {
                answer = i;
                break;
            }
        }

        System.out.println(answer);
    }

}