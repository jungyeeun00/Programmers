class Solution {
    public String solution(String phone_number) {
        // char []arr = phone_number.toCharArray();
        // StringBuilder star = new StringBuilder("");
        // for (int i=0;i<arr.length;i++) {
        //     if (i < arr.length-4) star.append("*");
        //     else star.append(arr[i]);
        // }
        // return star.toString();
        
        char [] arr = phone_number.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(i<arr.length-4)
                arr[i]='*';
        }
        return String.valueOf(arr);
    }
}