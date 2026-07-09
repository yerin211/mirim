def solution(num_str):
    answer = 0
    total = 0
    
    for num in num_str  :
        total += int(num)
        answer = total
    
    return answer