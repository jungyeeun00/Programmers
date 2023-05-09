import java.util.Arrays;

class Solution {
    public long solution(long n) {
//         char []arr = Long.toString(n).toCharArray();
//         Arrays.sort(arr);
        
//         char tmp;
//         for(int i=0;i<arr.length/2;i++){
//             tmp=arr[i];
//             arr[i]=arr[arr.length-1-i];
//             arr[arr.length-1-i]=tmp;
//         }
//         return Long.parseLong(String.valueOf(arr));
        
        String []str = String.valueOf(n).split("");
        Arrays.sort(str);
        
        StringBuilder sb = new StringBuilder();
        for(String s:str) sb.append(s);
        
        return Long.parseLong(sb.reverse().toString());
    }
}