import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb;
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            n = Integer.parseInt(str);
            sb = new StringBuilder();
            int len = (int) Math.pow(3, n);

            for (int i = 0; i < len; i++) {
                sb.append("-");
            }

            cantorian(0, len);
            System.out.println(sb);
        }
    }

    static void cantorian(int start, int size) {
        if (size == 1) {
            return;
        }

        int newSize = size / 3;
        for (int i = start + newSize; i < start + newSize * 2; i++) {
            sb.setCharAt(i, ' ');
        }
        cantorian(start, newSize);
        cantorian(start + newSize * 2, newSize);
    }


}