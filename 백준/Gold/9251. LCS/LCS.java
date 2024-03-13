import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str1 = st.nextToken();
        st = new StringTokenizer(br.readLine());
        String str2 = st.nextToken();
        int[][] lcs = new int[str1.length()+1][str2.length()+1];
        int answer = 0;

        for (int i = 1; i <= str1.length(); i++) {
            for (int j = 1; j <= str2.length(); j++) {
                lcs[i][j] = Math.max(lcs[i - 1][j], lcs[i][j - 1]);
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    lcs[i][j] = lcs[i - 1][j - 1] + 1;
                }
                answer = Math.max(answer, lcs[i][j]);
            }
        }

        System.out.println(answer);
    }
}