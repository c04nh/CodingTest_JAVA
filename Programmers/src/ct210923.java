// 1단계
// 콜라츠 추측

class Solution210923 {
    public int solution(long num) {
        int answer = 0;
        while(true){
            if(num == 1){
                break;
            }
            if(num % 2 == 0){
                num = num / 2;
                answer++;
            }else{
                num = num * 3 + 1;
                answer++;
            }
            if(answer == 500 && num != 1){
                answer = -1;
                break;
            }
            
        }
        return answer;
    }
}