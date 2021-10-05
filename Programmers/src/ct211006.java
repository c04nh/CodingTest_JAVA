// 1단계
// 완주하지 못한 선수

import java.util.Arrays;

class Solution211006 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant); // 오름차순 정렬
        Arrays.sort(completion); // 오름차순 정렬
        for(int i = 0; i < completion.length; i++){
            if(!participant[i].equals(completion[i])){ // participant의 i번째 값과 completion의 i번째 값이 같지 않으면
                answer = participant[i];
                break;
            }
        }
        if(answer.equals("")){
            answer = participant[participant.length-1];
        }
        
        return answer;
    }
}