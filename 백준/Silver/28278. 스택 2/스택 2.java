import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        Stack<Integer> stack = new Stack<>();
        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());
            int input = Integer.parseInt(st.nextToken());
            if (input == 1) {
                stack.push(Integer.parseInt(st.nextToken()));
                continue;
            } else if (input == 2) {
                if (stack.isEmpty()) {
                    sb.append(-1);
                } else {
                    sb.append(stack.pop());
                }
            } else if (input == 3) {
                sb.append(stack.size());
            } else if (input == 4) {
                if (stack.isEmpty()) {
                    sb.append(1);
                } else {
                    sb.append(0);
                }
            } else if (input == 5) {
                if (stack.isEmpty()) {
                    sb.append(-1);
                } else {
                    sb.append(stack.peek());
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);

    }
}