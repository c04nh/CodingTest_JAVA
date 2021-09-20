// 1단계
// 문자열 내림차순으로 배치하기

import java.util.Arrays;

class Solution210909 {
    public String solution(String s) {
        String answer = "";
        String arr[] = new String[s.length()];
        for(int i = 0; i < s.length(); i++){
            arr[i] = String.valueOf(s.charAt(i));
        }
        Arrays.sort(arr);
        for(int i = s.length() - 1; i >= 0; i--){
            answer += arr[i];
        }
        return answer;
    }
}