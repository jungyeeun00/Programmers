import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N, M, R;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] visited;
    static int[] result;
    static int cnt = 1;
    static StringBuilder sb = new StringBuilder();
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
         N = Integer.parseInt(st.nextToken());   //정점
         M = Integer.parseInt(st.nextToken());   //간선
         R = Integer.parseInt(st.nextToken());   //시작 정점

        visited = new boolean[N + 1];
        result = new int[N + 1];
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        for (int i = 0; i <= N; i++) {
            Collections.sort(graph.get(i), Collections.reverseOrder());
        }

        dfs(R);

        for (int i = 1; i <= N; i++) {
            sb.append(result[i]).append("\n");
        }

        System.out.println(sb);
    }

    static void dfs(int cur) {
        visited[cur] = true;
        result[cur] = cnt++;

        for (int i = 0; i < graph.get(cur).size(); i++) {
            int n = graph.get(cur).get(i);
            if (!visited[n]) dfs(n);
        }
    }
}