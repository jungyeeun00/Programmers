class Solution {
    public String solution(int[][] scores) {
        String answer = "";

        for(int i=0;i<scores[0].length;i++){
            float sum = 0;
            float avg = 0;
            int cnt = scores.length;
            int min = scores[0][i];
            int max = scores[0][i];
            int minChk = 0, maxChk = 0;
            for(int j=0;j<scores.length;j++){
                //자신과 같은 값이 있으면 +1
                minChk += (scores[j][i] <= scores[i][i]) ? 1 : 0;
                maxChk += (scores[j][i] >= scores[i][i]) ? 1 : 0;

                sum += scores[j][i];
            }
            if(minChk == 1||maxChk == 1){ //유일한 값이면
                cnt--;
                sum -= scores[i][i];
            }
            avg = sum / cnt;
            if(avg>=90){
                answer+="A";
            }else if(avg>=80){
                answer+="B";
            }else if(avg>=70){
                answer+="C";
            }else if(avg>=50){
                answer+="D";
            }else{
                answer+="F";
            }
        }
        return answer;
    }
}