class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        for (int i = p.length(); i <= t.length(); i++) {
            if (t.substring(i - p.length(), i).compareTo(p)<=0) answer++;
        }
        return answer;
    }
}