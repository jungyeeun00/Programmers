class Solution {
    public String solution(int[] food) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<food.length;i++){
            if(food[i]%2==1) food[i]--;
            for(int j=0;j<food[i]/2;j++){
                sb.append(i);
            }
        }
        return sb.toString()+"0"+sb.reverse().toString();
    }
}