import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static char board[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        board = new char[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            for (int j = 0; j < N; j++) {
                board[i][j] = str.charAt(j);
            }
        }

        recur(0, 0, N);
        System.out.println(sb);

    }

    static void recur(int row, int col, int size) {
        if (colorCheck(row, col, size)) {
            if (board[row][col] == '0') {
                sb.append(0);
            } else {
                sb.append(1);
            }
            return;
        }

        size /= 2;
        sb.append("(");
        recur(row, col, size);
        recur(row, col + size, size);
        recur(row + size, col, size);
        recur(row + size, col + size, size);
        sb.append(")");

    }

    static boolean colorCheck(int row, int col, int size) {
        char first = board[row][col];

        for (int i = row; i < row+size; i++) {
            for (int j = col; j < col+size; j++) {
                if (first != board[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }
}