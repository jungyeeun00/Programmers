import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        int N = sc.nextInt();
        int count = 1;
        while (N-->0){
            queue.offer(sc.nextInt());
        }

        while (!queue.isEmpty()) {
            if (queue.peek()==count){ //맨 앞 학생이 간식 먹는 순서라면
                queue.poll();
                count++;
            } else if (!stack.isEmpty() && stack.peek() == count) { //추가 대기열 맨 앞 학생이 간식 먹는 순서라면
                stack.pop();
                count++;
            } else {   //맨 앞 학생이 간식 먹는 순서가 아니면
                stack.push(queue.poll());
            }
        }
        while (!stack.isEmpty()) {
            if (stack.pop()!=count++){
                System.out.println("Sad");
                return;
            }
        }
        System.out.println("Nice");
    }
}