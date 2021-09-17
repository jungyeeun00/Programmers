import java.awt.*;
import java.util.stream.IntStream;

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int []lefts = new int[] {1,4,7};
        int []rights = new int[] {3,6,9};
        int []centers = new int[] {2,5,8,0};
        final int NOTHING = 100;

        int [][] coord = new int[][]{{1,2,3},{4,5,6},{7,8,9},{NOTHING, 0, NOTHING}};

        Point r_pos = new Point(3,2);
        Point l_pos = new Point(3,0);
        Point pos = new Point();

        for(int i=0;i<numbers.length;i++){
            int current = numbers[i];
            Loop:
            for (int j=0;j<coord.length;j++){
                for(int k=0;k<coord[j].length;k++){
                    if (current==coord[j][k]&&IntStream.of(lefts).anyMatch(it->it==current)){
                        answer+="L";
                        l_pos.setLocation(j, k);
                    }else if (current==coord[j][k]&&IntStream.of(rights).anyMatch(it->it==current)){
                        answer+="R";
                        r_pos.setLocation(j, k);
                    }else if(current==coord[j][k]&&IntStream.of(centers).anyMatch(it->it==current)){
                        pos.setLocation(j,k);
                        if (distance(r_pos, pos)<distance(l_pos, pos)){
                            r_pos.setLocation(j,k);
                            answer+="R";
                        }else if (distance(r_pos, pos)>distance(l_pos, pos)){
                            l_pos.setLocation(j,k);
                            answer+="L";
                        }else{
                            if (hand.equals("right")){
                                r_pos.setLocation(j,k);
                                answer+="R";
                            }else{
                                l_pos.setLocation(j,k);
                                answer+="L";
                            }
                        }
                    }
                }
            }
        }

        return answer;
    }
    private double distance(Point x_pos, Point y_pos){
        return Math.abs(x_pos.x-y_pos.x)+Math.abs(x_pos.y-y_pos.y);
    }
}
