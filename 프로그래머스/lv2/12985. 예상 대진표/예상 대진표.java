class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1;
        while (Math.min(a, b) % 2 != 1 || Math.abs(a - b) != 1) {
            a = (int) Math.ceil((double) a / 2);
            b = (int) Math.ceil((double) b / 2);
            answer++;
        }

        return answer;
    }
}