import java.util.*;
class Solution {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        int answer = 0;
        String test = s;
        do {
            for (int i=0;i<test.length();i++) {
                char first = test.charAt(i);
                if (stack.isEmpty()) {
                    stack.push(first);
                    continue;
                }
                char last = stack.peek();
                stack.push(first);
                if ((last == '(' && first == ')') || (last == '{' && first == '}') || (last == '[' && first == ']')) {
                    stack.pop();
                    stack.pop();
                }
            }
            if (stack.isEmpty()) answer++;
            stack.clear();
            test = test.substring(1) + test.charAt(0);
        }while (!test.equals(s));
        return answer;
    }
}