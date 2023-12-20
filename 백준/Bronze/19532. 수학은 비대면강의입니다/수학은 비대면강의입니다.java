import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[6];
        int x = 0, y = 0;
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i=-999;i<=999;i++){
            for(int j=-999;j<=999;j++){
                if ((arr[0] * i + arr[1] * j == arr[2]) && (arr[3] * i + arr[4] * j == arr[5])) {
                    x = i;
                    y = j;
                    break;
                }
            }
        }

        System.out.println(x + " " + y);
    }
}
