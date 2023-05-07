class Solution {
    boolean solution(String s) {        
//         char []arr = s.toLowerCase().toCharArray();
//         int p = 0, y = 0;

//         for (char c : arr) {
//             if (c=='p') p++;
//             if (c=='y') y++;
//         }

//         return (p==y);
        s = s.toLowerCase();
        return s.chars().filter(it->it=='p').count() == s.chars().filter(it->it=='y').count();
    }
}