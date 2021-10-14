// 1단계
// 나머지가 1이 되는 수 찾기

class Solution211015 {
    public int solution(int n) {
        int answer = 0;
        for(int i = n; i >= 1; i--){
            if(n % i == 1) answer = i;
        }
        return answer;
    }
}