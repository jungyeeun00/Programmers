import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        int answer = 1;
        int cnt = 1;
        for (String[] clothe : clothes) {
            if (hashMap.get(clothe[1]) != null) hashMap.replace(clothe[1], hashMap.get(clothe[1]) + 1);
            else hashMap.put(clothe[1], cnt);
        }

        if (hashMap.size()==1) return clothes.length;    
        for (String key :
                hashMap.keySet()) {
            answer *= hashMap.get(key) + 1;
        }
        return --answer;
    }
}