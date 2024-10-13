import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N, M, R;
    static boolean [] visited;
    static int[] result;
    static ArrayList<ArrayList<Integer>> graph;
    static int cnt = 1;
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
         N = Integer.parseInt(st.nextToken());   //정점
         M = Integer.parseInt(st.nextToken());   //간선
         R = Integer.parseInt(st.nextToken());   //시작 정점

        graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph.get(u).add(v);
            graph.get(v).add(u);    //무방향 그래프이므로 양쪽에 저장
        }
        for (int i = 1; i <= N; i++) {   //오름차순 탐색
            Collections.sort(graph.get(i));
        }

        visited = new boolean[N + 1];   //정점 방문 배열
        result = new int[N + 1];

        dfs(R);

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < result.length; i++) {
            sb.append(result[i]).append("\n");
        }
        System.out.println(sb);
    }

    static void dfs(int cur) {
        visited[cur] = true;
        result[cur] = cnt++;

        for (Integer value :
                graph.get(cur)) {
            if (!visited[value]) {
                dfs(value);
            }
        }
    }
}