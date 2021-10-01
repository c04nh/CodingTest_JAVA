// 1단계
// 시저 암호

class Solution211002 {
    public String solution(String s, int n) {
        String answer = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                answer += " ";
            }else{
                if(s.charAt(i) >= 65 && s.charAt(i) <= 90){
                    if(s.charAt(i) + n >= 91){
                        answer += s.charAt(i) + n - 26;
                    }else{
                        answer += s.charAt(i) + n;
                    }
                }else{
                    if(s.charAt(i) + n > 122){
                        answer += s.charAt(i) + n - 26;
                    }else{
                        answer += s.charAt(i) + n;
                    }
                }
            }
        }
        return answer;
    }
}