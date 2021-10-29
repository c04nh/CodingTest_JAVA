// 1단계
// 최대공약수와 최소공배수

class Solution210924 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int max_num = 0;
        int small, big;
        if(n > m){
            small = m;
            big = n;
        }else{
            small = n;
            big = m;
        }
        for(int i = 1; i < small + 1; i++){
            if(m % i == 0 && n % i == 0){
                max_num = i;
            }
        }
        answer[0] = max_num;
        answer[1] = n * m / max_num;
        return answer;
    }
}