class Solution {
    public String solution(int[] food) {
        // StringBuilder sb = new StringBuilder();
        // for(int i=1;i<food.length;i++){
        //     if(food[i]%2==1) food[i]--;
        //     for(int j=0;j<food[i]/2;j++){
        //         sb.append(i);
        //     }
        // }
        // return sb.toString()+"0"+sb.reverse().toString();
        
        String answer = "0";
        for(int i=food.length-1;i>0;i--){
            for(int j=0;j<food[i]/2;j++){
                answer=i+answer+i;
            }
        }
        return answer;
    }
}