import java.util.Arrays;
class Solution {
    public String solution(String[] seoul) {
        int idx = 0;
        // for (int i = 0; i < seoul.length; i++) {
        //     if (seoul[i].equals("Kim"))
        //        idx = i;
        // }
        idx = Arrays.asList(seoul).indexOf("Kim");

        return "김서방은 "+idx+"에 있다";
    }
}