class Solution {
    public String solution(int n) {
        // StringBuilder sb = new StringBuilder();
        // for(int i=0;i<n;i++){
        //     if(i%2==0)
        //         sb.append("수");
        //     else
        //         sb.append("박");
        // }
        // return sb.toString();
        return new String(new char[n/2+1]).replace("\0", "수박").substring(0, n);
    }
}