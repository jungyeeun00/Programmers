import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Arrays;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        
        // Deque <Integer> deque = new ArrayDeque<>();
        // for (int person : people) {
        //     deque.add(person);
        // }
        // while (!deque.isEmpty()) {
        //     int peek = deque.pollLast();
        //     answer++;
        //     if (deque.isEmpty()) break;
        //     if (deque.peekFirst()+peek<=limit){
        //         deque.pollFirst();
        //     }
        // }
        
        int i=0, j=people.length-1;
        while(i<=j){
            answer++;
            if(people[i]+people[j]<=limit) i++;
            j--;
        }
        
        return answer;
    }
}