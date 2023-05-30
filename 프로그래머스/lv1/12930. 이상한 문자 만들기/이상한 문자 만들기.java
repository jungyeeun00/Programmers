class Solution {
    public String solution(String s) {
        char []c = s.toCharArray();
        int idx = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i]==' ') {
                idx = 0;
                continue;
            }
            if (idx%2==0) c[i] -= (c[i]>'Z') ? 'a'-'A' : 0;
            else c[i] -= (c[i] > 'Z') ? 0 : 'A' - 'a';
            idx++;
        }
        return new String(c);
    }
}