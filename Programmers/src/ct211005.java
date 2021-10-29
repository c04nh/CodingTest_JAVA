// 1단계
// 1주차_부족한 금액 계산하기

class Solution211005 {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long total_price = 0; // int형 정수로 선언할 경우 오답
        for(int i = 1; i <= count; i++){
            total_price += price * i;
        }
        if(total_price > money){
            answer = total_price - money;
        }
        return answer;
    }
}