import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static long min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
    static int[] num;
    static int[] oper = new int[4];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        num = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            oper[i] = Integer.parseInt(st.nextToken());
        }

        operation(1, num[0]);

        System.out.println(max + "\n" + min);
     }

    static void operation(int idx, int result) {
        if (idx == N) {
            if (result < min) {
                min = result;
            }
            if (result > max) {
                max = result;
            }
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (oper[i] > 0) {
                oper[i]--;

                switch (i) {
                    case 0:
                        operation(idx + 1, result + num[idx]); break;
                    case 1:
                        operation(idx + 1, result - num[idx]); break;
                    case 2:
                        operation(idx + 1, result * num[idx]); break;
                    case 3:
                        operation(idx + 1, result / num[idx]); break;
                }

                oper[i]++;
            }
        }

    }



}
