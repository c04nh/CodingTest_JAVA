// 1단계
// 문자열을 정수로 바꾸기

class Solution210905 {
    public int solution(String s) {
        String ss = "";
        int answer = 0;
        if(s.charAt(0) == '+'){
            ss = s.substring(1, s.length());
            answer = Integer.parseInt(ss);
        }else if(s.charAt(0) == '-'){
            ss = s.substring(1, s.length());
            answer = Integer.parseInt(ss);
            answer *= -1;
        }else{
            ss = s.substring(0, s.length());
            answer = Integer.parseInt(ss);
        }
        return answer;
    }
}