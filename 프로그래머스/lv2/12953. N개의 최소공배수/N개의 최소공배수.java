class Solution {
    public int solution(int[] arr) {
        int lcm = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int gcd = 0;
            int a = lcm;
            int b = arr[i];
            for(int j=1;j<=a&&j<=b;j++){
                if (a%j==0&&b%j==0) gcd=j;
            }
            lcm = lcm*arr[i]/gcd;
        }
        return lcm;
    }
}