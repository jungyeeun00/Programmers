import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] cards = new int[N];
        for(int i=0;i<N;i++){
            cards[i] = sc.nextInt();
        }

        Arrays.sort(cards);

        int M = sc.nextInt();
        int []checkCards = new int[M];

        HashMap<Integer, Boolean> check = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<M;i++){
            checkCards[i] = sc.nextInt();
            sb.append(binarySearch(checkCards[i], 0, N - 1, cards)).append(" ");
        }

        System.out.println(sb);
    }

    static int binarySearch(int key, int low, int high, int []arr){
        int mid;

        while (low<=high){
            mid=(low+high)/2;
            if (key==arr[mid]) return 1;
            else if (key<arr[mid]) high = mid-1;
            else low = mid+1;
        }

        return 0;
    }

}