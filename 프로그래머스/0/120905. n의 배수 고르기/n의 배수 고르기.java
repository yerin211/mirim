class Solution {
    public int[] solution(int n, int[] numlist) {
        int b=0;
        for(int i=0;i<numlist.length;i++){
            if(numlist[i]%n==0){
                b++;
            }
        }
        int a=0;
        int[] answer = new int[b];
        for(int i=0;i<numlist.length;i++){
            if(numlist[i]%n==0){
                answer[a]=numlist[i];
                a++;
            }
        }
        return answer;
    }
}