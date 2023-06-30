class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        // int idx = 0;
        // for(int i=1;i<=n;i++){
        //     if(section[idx]==i){
        //         i = i + m - 1;
        //         if(section[idx]<=i){
        //             while(true){
        //                 if (idx==section.length-1||section[idx]>i) break;
        //                 idx++;
        //             }
        //         }
        //         answer++;
        //     }
        // }
        
        int maxPainted = 0;
        for(int painted:section){
            if(painted>=maxPainted){
                maxPainted=painted+m;
                answer++;
            }
        }
        return answer;
    }
}