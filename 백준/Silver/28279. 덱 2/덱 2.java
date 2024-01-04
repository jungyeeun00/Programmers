import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        Deque<Integer> deque = new ArrayDeque<>();

        int n = Integer.parseInt(br.readLine());

        while(n-->0){
            st = new StringTokenizer(br.readLine());
            int cmd = Integer.parseInt(st.nextToken());

            if(cmd==1){
                deque.addFirst(Integer.parseInt(st.nextToken()));
            } else if (cmd==2){
                deque.addLast(Integer.parseInt(st.nextToken()));
            } else if (cmd==3){
                sb.append(deque.isEmpty() ? -1 : deque.pollFirst()).append("\n");
            } else if (cmd==4){
                sb.append(deque.isEmpty() ? -1 : deque.pollLast()).append("\n");
            } else if (cmd==5){
                sb.append(deque.size()).append("\n");
            } else if (cmd==6){
                sb.append(deque.isEmpty() ? 1 : 0).append("\n");
            } else if(cmd==7){
                sb.append(deque.isEmpty() ? -1 : deque.peekFirst()).append("\n");
            } else if (cmd==8){
                sb.append(deque.isEmpty() ? -1 : deque.peekLast()).append("\n");
            }
        }
        br.close();
        System.out.println(sb);
    }

}