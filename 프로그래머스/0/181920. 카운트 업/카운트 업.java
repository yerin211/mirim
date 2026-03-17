class Solution {
    public int[] solution(int start_num, int end_num) {
        int b=0;
        for(int i=start_num;i<=end_num;i++){
            b++;
        }
        int[] answer = new int[b];
        int a=0;
        for(int i=start_num;i<=end_num;i++){
            answer[a]=i;
            a++;
        }
        return answer;
    }
}