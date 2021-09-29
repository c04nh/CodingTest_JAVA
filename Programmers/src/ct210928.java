// 1단계
// 정수 내림차순으로 배치하기

import java.util.Arrays;

class Solution210928 {
    public long solution(long n) {
        long answer = 0;
        String str_n = Long.toString(n); //long타입 정수를 문자열로 변환
        char[] n_list = new char[str_n.length()];
        String reverse_n = "";
        for(int i = 0; i < str_n.length(); i++){
            n_list[i] = str_n.charAt(i); //문자열로 변환한 값에 index로 접근해서 char형 배열에 담기
        }
        Arrays.sort(n_list); //배열 오름차순으로 정렬
        for(int i = str_n.length() - 1; i >= 0; i--){
            reverse_n += n_list[i]; //뒤에서부터 문자열에 추가
        }
        answer = Long.parseLong(reverse_n); //문자열을 long타입 정수로 변환
        return answer;
    }
}