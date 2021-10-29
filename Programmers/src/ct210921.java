// 1단계
// 핸드폰 번호 가리기

class Solution210921 {
    public String solution(String phone_number) {
        String answer = "";
        for(int i = 0; i < phone_number.length(); i++){
            if(i >= phone_number.length() - 4){
                answer += phone_number.charAt(i);
            }else{
                answer += "*";
            }
        }
        return answer;
    }
}
