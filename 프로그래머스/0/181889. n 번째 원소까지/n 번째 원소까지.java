class Solution {
    public int[] solution(int[] num_list, int n) {
        int a=0;
        for(int i=0;i<num_list.length-(num_list.length-n);i++){
            a++;
        }
        int[] answer = new int[a];
        for(int i=0;i<num_list.length-(num_list.length-n);i++){
            answer[i]=num_list[i];
        }
        return answer;
    }
}