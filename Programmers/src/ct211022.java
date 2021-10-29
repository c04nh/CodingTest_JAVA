// 1단계
// 키패드 누르기

class Solution211022 {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int l = 10;
        int r = 12;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7){
                answer += "L";
                l = numbers[i];
            }else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9){
                answer += "R";
                r = numbers[i];
            }else{
                if(numbers[i] == 0) numbers[i] = 11;
                int absL = Math.abs(numbers[i] - l);
                int absR = Math.abs(numbers[i] - r);
                if((absL / 3 + absL % 3) > (absR / 3 + absR % 3)){
                    answer += "R";
                    r = numbers[i];
                }else if((absL / 3 + absL % 3) < (absR / 3 + absR % 3)){
                    answer += "L";
                    l = numbers[i];
                }else{
                    if(hand.equals("left")){
                        answer += "L";
                        l = numbers[i];
                    }else{
                        answer += "R";
                        r = numbers[i];
                    }
                }
            }
        }
        return answer;
    }
}
