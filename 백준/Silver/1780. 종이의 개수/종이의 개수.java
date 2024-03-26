import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int minus = 0, zero = 0, plus = 0;
    static int board[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        board = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        recur(0, 0, N);
        sb.append(minus).append("\n").append(zero).append("\n").append(plus);
        System.out.println(sb);

    }

    static void recur(int row, int col, int size) {
        if (colorCheck(row, col, size)) {
            if (board[row][col] == -1) {
                minus++;
            } else if (board[row][col] == 0) {
                zero++;
            } else {
                plus++;
            }
            return;
        }

        size /= 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                recur(row + i * size, col + j * size, size);
            }
        }
    }

    static boolean colorCheck(int row, int col, int size) {
        int first = board[row][col];

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