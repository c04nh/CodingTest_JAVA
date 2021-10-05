// 1단계
// 자연수 뒤집어 배열로 만들기

class Solution210929 {
    public int[] solution(long n) {
        String str_n = Long.toString(n); // long타입 정수를 문자열로 변환 후 str_n에 저장
        int[] answer = new int[str_n.length()]; // str_n의 길이만큼 정수형 배열의 크기를 할당
        for(int i = str_n.length() - 1; i >= 0; i--){ // str_n의 맨뒤부터 거꾸로
            answer[str_n.length() - i - 1] = Character.getNumericValue(str_n.charAt(i)); 
            // str_n.charAt() : str_n을 index로 접근 후 char형으로 변환
            // Character.getNumericValue() : char형 변수를 정수로 변환
        }
        return answer;
    }
}