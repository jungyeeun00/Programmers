import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        for (int i = 0; i < cities.length; i++) {
            cities[i]=cities[i].toLowerCase();
        }
        Queue<String> cache = new LinkedList<>();
        for (String city :
                cities) {
            if (cache.contains(city)) {
                cache.remove(city);
                cache.add(city);
                answer++;
                continue;
            }
            if (cache.size()>=cacheSize)
                cache.poll();
            answer+=5;
            if(cacheSize>0)
                cache.add(city);
        }
        return answer;
    }
}