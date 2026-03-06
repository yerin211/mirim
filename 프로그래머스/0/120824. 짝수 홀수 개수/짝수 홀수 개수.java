class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int a=0;
        int b=0;
        for(int j=0;j<num_list.length;j++){
            if(num_list[j]%2==0)
                a++;
            else{
                b++;
           } 
        }
        answer[0]=a; 
        answer[1]=b;
        return answer;
    }
}