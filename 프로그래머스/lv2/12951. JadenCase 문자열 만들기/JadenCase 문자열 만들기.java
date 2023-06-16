class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        sb.append(Character.toUpperCase(s.charAt(0)));
        for(int i=1;i<s.length();i++) {
            if (s.charAt(i) == ' ') {
                flag = true;
                sb.append(Character.toLowerCase(s.charAt(i)));
                continue;
            }
            if (flag) {
                sb.append(Character.toUpperCase(s.charAt(i)));
                flag = false;
            } else {
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        return sb.toString();
    }
}