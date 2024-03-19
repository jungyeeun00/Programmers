import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int white = 0, blue = 0;
    static int board[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
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
        sb.append(white).append("\n").append(blue);
        System.out.println(sb);

    }

    static void recur(int row, int col, int size) { //row 행 시작점, col 열 시작점, size 끝 점
        if (colorCheck(row, col, size)) {//arr가 다 같은 색이면
            if (board[row][col] == 0) {
                white++;
            } else {
                blue++;
            }
            return;
        }

        size /= 2;
        recur(row, col, size);
        recur(row + size, col, size);
        recur(row, col + size, size);
        recur(row + size, col + size, size);

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