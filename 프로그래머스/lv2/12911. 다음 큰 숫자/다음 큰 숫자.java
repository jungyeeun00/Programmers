class Solution {
    public int solution(int n) {
        int answer = n;
        int cnt = 0;
        for (char c :
                Integer.toString(n, 2).toCharArray()) {
            if (c == '1') cnt++;
        }
        while (true){
            answer++;
            String bin = Integer.toString(answer, 2);
            int count = 0;
            for (char c :
                    bin.toCharArray()) {
                if (c=='1') count++;
            }
            if (cnt==count) break;
        }
        return answer;
    }
}