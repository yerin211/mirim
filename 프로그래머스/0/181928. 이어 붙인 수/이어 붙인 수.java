class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int a=0;
        int b=0;
        for(int i=0;i<num_list.length;i++){
            if(num_list[i]%2==1){
                a+=num_list[i];
                a*=10;
            }
            else{
                b+=num_list[i];
                b*=10;
            }
        }
        a/=10;
        b/=10;
        answer=a+b;
        return answer;
    }
}