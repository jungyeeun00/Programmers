import java.util.*;
class Solution {
    public int solution(String word) {
        /*
        String[] alpha = {"A", "E", "I", "O", "U"};
        String add = "";
        List<String> list = new ArrayList<>(Arrays.asList(alpha));
        for (int i = 0; i < list.size(); i++) {
            for (String s : alpha) {
                add = list.get(i) + s;
                list.add(list.get(i) + s);
            }
            if (add.equals("UUUUU")) break;
        }

        Collections.sort(list);
        return list.indexOf(word)+1;
        */
        int answer=0, length=3905;
        for(String s:word.split("")){
            answer+="AEIOU".indexOf(s)*(length/=5)+1;
        }
        return answer;
    }
}