class Solution {
    public int solution(int n) {
        String n3 = Integer.toString(n, 3);
        char [] n3reverse = n3.toCharArray();
        for(int i=0;i<n3reverse.length/2;i++){
            char tmp = n3reverse[i];
            n3reverse[i] = n3reverse[n3reverse.length-i-1];
            n3reverse[n3reverse.length-i-1] = tmp;
        }
        int n10 = Integer.parseInt(new String(n3reverse), 3);
        
        return n10;
    }
}