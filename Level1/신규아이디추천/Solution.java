import java.util.*;

class Solution {
    public String solution(String new_id) {
        String answer = "";
       
        //#1
        answer = new_id.toLowerCase();
        //#2
        answer = answer.replaceAll("[^a-z0-9-_.]", "");

        //#3
        answer = answer.replaceAll("[..]+", ".");


        //#4
        if (answer.charAt(0)=='.'){
            answer = answer.substring(1);
        }
        if (!answer.isEmpty()&&answer.charAt(answer.length()-1)=='.'){
            answer = answer.substring(0, answer.length()-1);
        }

        //#5
        if (answer.isEmpty()) answer="a";

        //#6
        if (answer.length()>=16){
            answer = answer.substring(0, 15);
        }
        if (answer.charAt(answer.length()-1)=='.'){
            answer = answer.substring(0, answer.length()-1);
        }

        //#7
        if (answer.length()<=2){
            char ch = answer.charAt(answer.length()-1);
            while (answer.length()<3){
                answer = answer.concat(Character.toString(ch));
            }
        }


        return answer;
    }
}
