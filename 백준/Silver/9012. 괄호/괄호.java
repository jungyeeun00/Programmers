import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            String PS = br.readLine();
            for (int j = 0; j < PS.length(); j++) {
                char c = PS.charAt(j);
                if (c == '(') {
                    stack.push(c);
                } else {
                    if (stack.isEmpty()) {
                        sb.append("NO\n");
                        break;
                    }
                    stack.pop();
                }

                if (j == PS.length() - 1) {
                    if (stack.isEmpty()) sb.append("YES\n");
                    else sb.append("NO\n");
                }
            }
            stack.clear();
        }

        System.out.println(sb);
    }

}