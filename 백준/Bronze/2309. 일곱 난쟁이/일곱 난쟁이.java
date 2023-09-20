import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int idx1 = 7, idx2 = 7;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (Arrays.stream(arr).sum() - arr[i] - arr[j] == 100) {
                    idx1 = i;
                    idx2 = j;
                    break;
                }
            }
            if (idx1!=7&&idx2!=7) break;
        }

        int[] answer = new int[7];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if (i==idx1||i==idx2) continue;
            answer[j++]=arr[i];
        }
        Arrays.sort(answer);
        
        for(int i:answer)
            System.out.println(i);
    }
}