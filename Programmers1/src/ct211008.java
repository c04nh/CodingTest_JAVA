// 1단계
// 없는 숫자 더하기

class Solution211008 {
    public int solution(int[] numbers) {
        int answer = 45; // 0 ~ 9까지의 합
        for(int i = 0; i < numbers.length; i++){
            answer -= numbers[i];
        }
        return answer;
    }
}