class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");

        String max=arr[0], min=arr[0];
        for(String num:arr){
            if(Integer.parseInt(num)>Integer.parseInt(max)) max=num;
            if(Integer.parseInt(num)<Integer.parseInt(min)) min=num;
        }
        return min+" "+max;
    }
}