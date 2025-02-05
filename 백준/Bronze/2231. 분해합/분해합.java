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
        while (M > 0) {
            sum = copyM = M;
            while (copyM > 0) {
                sum += (copyM % 10);
                copyM /= 10;
            }
            if(sum == N) answer = M;
            M--;
        }

        System.out.println(answer);
    }

}