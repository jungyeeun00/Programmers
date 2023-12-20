import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;

public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int[]sort = new int[N];
        HashMap<Integer, Integer> rank = new HashMap<Integer, Integer>();

        for(int i=0;i<N;i++){
            sort[i] = arr[i] = sc.nextInt();
        }

        Arrays.sort(sort);

        int ranking = 0;
        for(int i:sort){
            if (!rank.containsKey(i))
                rank.put(i, ranking++);
        }
        
        StringBuilder sb = new StringBuilder();

        for(int i:arr){
            sb.append(rank.get(i)).append(' ');
        }
        
        System.out.println(sb);
    }
}