import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap<String, Integer> hash = new HashMap<>();

        for (int j = 0; j <= discount.length - 10; j++) {
            for (int i = 0; i < want.length; i++) {
                hash.put(want[i], number[i]);
            }
            for (int i = j; i < j + 10; i++) {
                if (!hash.containsKey(discount[i])) break;
                hash.replace(discount[i], hash.get(discount[i]) - 1);
                if (hash.get(discount[i]) == 0) hash.remove(discount[i]);
                if (i == j + 9) answer++;
            }
        }
        return answer;
    }
}