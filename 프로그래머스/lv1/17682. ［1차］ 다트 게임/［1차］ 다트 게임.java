class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        char[] arr = dartResult.toCharArray();
        int score = 0;
        int prevScore = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '1' && arr[i + 1] == '0') {
                prevScore = score;
                score = 10;
                i++;
                continue;
            } else if (arr[i] >= '0' && arr[i] <= '9') {
                prevScore = score;
                score = arr[i] - '0';
                continue;
            }
            else if (arr[i] == 'D') {
                score = score * score;
            }
            else if (arr[i] == 'T') {
                score = (int) Math.pow(score, 3);
            }
            else if (arr[i] == '*') {
                int savedScore = score;
                score = (prevScore + score);
                answer += score;
                score=savedScore*2;
                continue;
            }
            else if (arr[i] == '#') {
                answer-=score;
                score = -score;
            }
            answer+=score;
        }
        return answer;
    }
}