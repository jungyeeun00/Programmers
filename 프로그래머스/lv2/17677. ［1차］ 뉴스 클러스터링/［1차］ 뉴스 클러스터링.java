import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        List<String> union1 = new ArrayList<>();
        char[] arr1 = str1.toCharArray();
        List<String> union2 = new ArrayList<>();
        char[] arr2 = str2.toCharArray();
        List<String> intersaction = new ArrayList<>();
        List<String> union = new ArrayList<>();

        for (int i = 0; i < arr1.length - 1; i++) {
            if (('a' > arr1[i] || arr1[i] > 'z') || ('a' > arr1[i + 1] || arr1[i + 1] > 'z')) {
                continue;
            }
            union1.add(String.valueOf(arr1[i]) + arr1[i + 1]);
        }
        for (int i = 0; i < arr2.length - 1; i++) {
            if (('a' > arr2[i] || arr2[i] > 'z') || ('a' > arr2[i + 1] || arr2[i + 1] > 'z')) {
                continue;
            }
            union2.add(String.valueOf(arr2[i]) + arr2[i + 1]);
        }
        
        Collections.sort(union1);
        Collections.sort(union2);

        for (String s : union1) {
            if (union2.remove(s))
                intersaction.add(s);
            union.add(s);
        }

        union.addAll(union2);

        if (union.isEmpty()) answer = 65536;
        else answer = (int) ((double) intersaction.size() / union.size() * 65536);

        return answer;
    }
}