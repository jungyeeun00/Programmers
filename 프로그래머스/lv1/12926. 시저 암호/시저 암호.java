class Solution {
    public String solution(String s, int n) {
        char []arr = s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==' ') continue;
            if(arr[i]+n>'z') arr[i]= (char) (arr[i] + n - 'z' + 'a' - 1);
            else if(arr[i]<='Z'&&arr[i]+n>'Z') arr[i] = (char) (arr[i] + n - 'Z' + 'A' - 1);
            else arr[i]+=n;
        }
        
        return new String(arr);
    }
}