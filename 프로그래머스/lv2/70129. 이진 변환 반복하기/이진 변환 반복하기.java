class Solution {
    public int[] solution(String s) {
        int cnt1 = 0, cnt2 = 0;
        while(!s.equals("1")){
            cnt1++;
            for (char c :
                    s.toCharArray()) {
                if (c == '0') cnt2++;
            }
            s=Integer.toString(s.replace("0","").length(), 2);
        }
        int[] answer = {cnt1, cnt2};
        return answer;
    }
}