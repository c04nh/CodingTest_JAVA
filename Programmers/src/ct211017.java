// 1단계
// 3진법 뒤집기

class Solution211017 {
    public int solution(int n) {
        int answer = 0;
        String result = "";
        while(n > 0){
            result += Integer.toString(n % 3);
            n /= 3;
        }
        int squared = result.length() - 1;
        for(int i = 0; i < result.length(); i++){
            answer += Character.getNumericValue(result.charAt(i)) * Math.pow(3, squared);
            squared--;
        }
        return answer;
    }
}
