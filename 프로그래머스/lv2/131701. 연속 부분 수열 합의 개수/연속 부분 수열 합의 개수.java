import java.util.*;
class Solution {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < elements.length; i++) { //시작위치
            for (int j = 1; j <= elements.length; j++) { //갯수
                int sum;
                if (i + j > elements.length) {
                   sum = Arrays.stream(elements, i, elements.length).sum() + Arrays.stream(elements, 0, (i + j) % elements.length).sum();
                } else {
                    sum = Arrays.stream(elements, i, i + j).sum();
                }
                set.add(sum);
            }
        }
        return set.size();
    }
}