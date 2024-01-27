import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        int q = sc.nextInt();

        int[][] alpha = new int[26][S.length() + 1];

        alpha[S.charAt(0) - 'a'][1] = 1;
        for (int i = 0; i < 26; i++) {
            for (int j = 1; j < S.length(); j++) {
                alpha[i][j + 1] = alpha[i][j] + (S.charAt(j) == i + 'a' ? 1 : 0);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (q-- > 0) {
            char c = sc.next().charAt(0);
            int l = sc.nextInt();
            int r = sc.nextInt();

            sb.append(alpha[c - 'a'][r + 1] - alpha[c - 'a'][l]).append("\n");
        }

        System.out.println(sb);

    }
}