// 1단계
// 서울에서 김서방 찾기

class Solution210907 {
    public String solution(String[] seoul) {
        String answer = "김서방은 ";
        for(int i = 0; i < seoul.length; i++){
            if(seoul[i].equals("Kim")){
                answer += i;
            }
        }
        answer += "에 있다";
        return answer;
    }
}