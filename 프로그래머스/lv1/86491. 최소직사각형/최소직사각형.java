class Solution {
    public int solution(int[][] sizes) {
        // for (int i = 0; i < sizes.length; i++) {
        //     if (sizes[i][1]>sizes[i][0]){
        //         int tmp = sizes[i][1];
        //         sizes[i][1]=sizes[i][0];
        //         sizes[i][0]=tmp;
        //     }
        // }
        // int width = sizes[0][0];
        // int height = sizes[0][1];
        // for (int i = 0; i < sizes.length; i++) {
        //     if(sizes[i][0]>width) width = sizes[i][0];
        //     if(sizes[i][1]>height) height = sizes[i][1];
        // }
        int width = 0, height = 0;
        for(int[] card:sizes){
            width = Math.max(width, Math.max(card[0], card[1]));
            height = Math.max(height, Math.min(card[0], card[1]));
        }
        return width*height;
    }
}