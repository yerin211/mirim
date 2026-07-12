function solution(order) {
    var answer = 0;
    for(ord of order){
        if(ord.includes("americano")){
            answer+=4500;
        }
        else if(ord.includes("cafelatte")){
            answer+=5000;
        }
        else if(ord = "anything"){
            answer+=4500;
        }
    }
    return answer;
}