// 1단계
// 문자열 내 p와 y의 개수

class Solution210910 {
    boolean solution(String s) {
        boolean answer = true;
        int countP = 0;
        int countY = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'P' || s.charAt(i) == 'p'){
                countP++;
            }else if(s.charAt(i) == 'Y' || s.charAt(i) == 'y'){
                countY++;
            }
        }
        if(countP == countY){
            answer = true;
        }else{
            answer = false;
        }
        return answer;
    }
}