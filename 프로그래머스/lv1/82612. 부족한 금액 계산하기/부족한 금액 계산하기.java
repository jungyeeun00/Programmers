class Solution {
    public long solution(long price, long money, long count) {
        // long res=0;
        // for(int i=1;i<=count;i++){
        //     res+=price*i;
        // }
        // return (res>money)?res-money:0;
        return Math.max(price*(count+count*count)/2-money, 0);
    }
}