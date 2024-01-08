import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        Deque<Integer> d = new ArrayDeque<>();
        int N = sc.nextInt();
        int []move = new int[N];

        for(int i=0;i<N;i++){
            d.add(i+1);
            move[i] = sc.nextInt();
        }
        

        sb.append(d.removeFirst()).append(" ");

        int moveCount = move[0];
        while(!d.isEmpty()){
            int out;
            if (moveCount>0) {
                while(--moveCount>0){
                    d.addLast(d.removeFirst());
                }
                out = d.removeFirst();
                sb.append(out).append(" ");
            } else{
                moveCount = moveCount*(-1);
                while(moveCount-->0){
                    d.addFirst(d.removeLast());
                }
                out = d.removeFirst();
                sb.append(out).append(" ");
            }
            moveCount = move[out-1];
        }

        System.out.println(sb);
        
    }
}