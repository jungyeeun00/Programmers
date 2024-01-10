import java.util.*;

public class Main {
    static int[] f = new int[41];
    static int fibCnt = 0;
    static int fibonacciCnt = 0;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        fib(n);
        fibonacci(n);
        System.out.println(fibCnt+" "+fibonacciCnt);
    }

    static int fib(int n){
        if (n==1 || n==2) {
            fibCnt++;
            return 1;
        }
        else return fib(n-1)+fib(n-2);
    }

    static int fibonacci(int n){
        f[0] = f[1] = 1;
        for (int i=2;i<n;i++){
            fibonacciCnt++;
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];
    }

}