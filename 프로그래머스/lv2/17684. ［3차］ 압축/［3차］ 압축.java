import java.util.*;
class Solution {
    public int[] solution(String msg) {
        List<Integer> list = new ArrayList<>();
        List<String> dict = new ArrayList<>();
        for (char i = 'A'; i <= 'Z'; i++) {
            dict.add(String.valueOf(i));
        }

        int idx = 1, cnt = 0;
        while (idx + cnt <= msg.length()) {
            String s = msg.substring(0, idx + cnt);
            if (dict.contains(s)) {
                if (idx + (cnt + 1) <= msg.length() && dict.contains(msg.substring(0, idx + (cnt + 1)))) {
                    cnt++;
                    continue;
                }
                list.add(dict.indexOf(s) + 1);
//                idx++;
                cnt++;
            } else {
                idx = 1;
                cnt = 0;
                msg = msg.substring(s.length() - 1);
                dict.add(s);
            }
        }

        int []answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}