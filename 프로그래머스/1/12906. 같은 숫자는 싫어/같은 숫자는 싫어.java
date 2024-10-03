import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        ArrayList<Integer> list = new ArrayList();
        int preNum = 10;
        for(int i=0;i<arr.length;i++){
            if(preNum!=arr[i]){
                list.add(arr[i]);
            }
            preNum=arr[i];
        }
        
        answer = new int[list.size()];
        
        for(int i=0;i<answer.length;i++){
            answer[i] = list.get(i).intValue();
        }


        return answer;
    }
}