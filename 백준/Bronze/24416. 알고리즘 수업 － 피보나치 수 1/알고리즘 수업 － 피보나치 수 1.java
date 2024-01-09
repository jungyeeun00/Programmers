import java.util.*;

public class Main {
    static int []fibo = new int[41];
    static int recCnt=0;
    static int dpCnt=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        fiboRecursion(N);
        fiboDP(N);
        System.out.println(recCnt+" "+dpCnt);

    }

    static int fiboRecursion(int n){
        if(n==1||n==2) {
            recCnt++;
            return 1;
        }
        else return fiboRecursion(n-1)+fiboRecursion(n-2);
    }

    static int fiboDP(int n){
        fibo[0]=1;
        fibo[1]=1;
        for (int i=2;i<n;i++){
            dpCnt++;
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        return fibo[n];
    }
}