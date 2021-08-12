import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> arr = new HashSet<Integer>();

        for(int i=0;i<nums.length;i++)
            arr.add(nums[i]);

        answer = arr.size() <= nums.length/2 ? arr.size():nums.length/2;

        return answer;
    }
}