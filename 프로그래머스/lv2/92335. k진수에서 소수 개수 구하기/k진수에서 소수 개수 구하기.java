import java.util.*;
class Solution {
    public int solution(int n, int k) {
        int answer = 0;
String radix = Long.toString(n, k);
        long []changes = Arrays.stream(radix.split("[0]+")).mapToLong(Long::parseLong).toArray();

        for (long change : changes) {
            if (isPrime(change)) answer++;
        }
        return answer;
    }
    public static boolean isPrime(long n) {
        if (n == 1) {
            return false;
        } else {
            for (int i = 2; i <= (int)Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}