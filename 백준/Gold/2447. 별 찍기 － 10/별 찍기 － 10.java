import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb;
    static char[][] answer;
    static int len;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        len = Integer.parseInt(str);
        sb = new StringBuilder();
        answer = new char[len][len];

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                answer[i][j] = ' ';
            }
        }

        recur(0,0, len);

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                sb.append(answer[i][j]);
            }
            sb.append("\n");
        }

        System.out.println(sb);

    }

    static void recur(int x, int y, int size) {
        if (size == 1) {
            answer[x][y] = '*';
            return;
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!(i == 1 && j == 1)) {
                    recur(x + i * size / 3, y + j * size / 3, size / 3);
                }
            }
        }

    }


}