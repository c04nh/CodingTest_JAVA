// 1단계
// 숫자 문자열과 영단어

class Solution211013 {
    public int solution(String s) {
        int answer = 0;
        String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < num.length; i++){
            s = s.replace(num[i], Integer.toString(i));
        }
        answer = Integer.parseInt(s);
        return answer;
    }
}