class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        int i=0;
        int a=k;
        while(true){
            if(n<k){
                break;
            }
            answer[i]=a;
            a+=k;
            n-=k;
            i++;
            
        }
        return answer;
    }
}