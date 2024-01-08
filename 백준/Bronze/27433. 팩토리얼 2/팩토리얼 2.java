import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(factorial(sc.nextInt()));
    }

    static long factorial(int n){
        if (n<=1) return 1;

        return n * factorial(n - 1);
    }
}