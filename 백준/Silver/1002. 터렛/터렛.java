import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
//    static StringTokenizer st;

    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            sb.append(checkPos(br.readLine())).append("\n");
        }

        System.out.println(sb);
    }

    public static int checkPos(String str) {
        int[] arr = new int[6];
        StringTokenizer st = new StringTokenizer(str);
        for (int i = 0; i < 6; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        if (arr[0] == arr[3] && arr[1] == arr[4] && arr[2] == arr[5]) { //두 사람의 위치와 거리가 동일할 때
//            sb.append("-1\n");
            return -1;
        }

        int d = (int) (Math.pow(arr[0] - arr[3], 2) + Math.pow(arr[1] - arr[4], 2));
        if (d > Math.pow(arr[2] + arr[5], 2)) {     //원이 닿아있지 않을 때
//            sb.append("0\n");
            return 0;
        } else if (d < Math.pow(arr[2] - arr[5], 2)) {  //원 안에 원이 있을 때
//            sb.append("0\n");
            return 0;
        } else if (d == Math.pow(arr[2] - arr[5], 2)) { //두 원이 내접할 때
//            sb.append("1\n");
            return 1;
        } else if (d == Math.pow(arr[2] + arr[5], 2)) { //두 원이 외접할 때
//            sb.append("1\n");
            return 1;
        } else {
//        } else if (d < Math.pow(arr[2] + arr[5], 2)) { //원이 겹칠 때 (두 원의 중점 사이 거리 < 두 원의 반지름의 합
//            sb.append("2\n");
            return 2;
        }

    }

}