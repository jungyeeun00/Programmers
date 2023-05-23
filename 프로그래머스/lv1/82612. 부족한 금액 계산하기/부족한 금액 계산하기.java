class Solution {
    public long solution(int price, int money, int count) {
        long res=0;
        for(int i=1;i<=count;i++){
            res+=price*i;
            System.out.println(res+", "+i);
        }
        return (res>money)?res-money:0;
    }
}