// 1단계
// 자릿수 더하기

import java.util.*;

class Solution210930 {
    public int solution(int n) {
        int answer = 0;
        String str_n = Integer.toString(n); // int형 정수를 문자열로 변환 후 저장
        for(int i = 0; i < str_n.length(); i++){
            answer += Character.getNumericValue(str_n.charAt(i));
            // str_n.charAt() : str_n에 인덱스로 접근 후 char형으로 변환
            // Character.getNumericValue() : char형을 정수형으로 변환
        }
        return answer;
    }
}