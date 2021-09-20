// 1단계
// 가운데 글자 가져오기

class Solution210914 {
    public String solution(String s) {
        String answer = "";
        int str_len = s.length();
    
        if(str_len % 2 == 0){
            answer += s.charAt(str_len / 2 - 1);
            answer += s.charAt(str_len / 2);
        }else{
            answer += s.charAt((int)(str_len) / 2);
        }

        return answer;
    }
}
