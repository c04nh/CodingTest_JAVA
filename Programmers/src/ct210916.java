// 1단계
// 약수의 개수와 덧셈

class Solution210916 {
    public int solution(int left, int right) {
        int answer = 0;
        int count_num = 0;
        for(int x = left; x <= right; x++){
            count_num = 0;
            for(int y = 1; y <= x; y++){
                if(x % y == 0){
                    count_num += 1;
                }
            }
            if(count_num % 2 == 0){
                answer += x;
            }else{ 
                answer -= x;
            }
        }
            
        return answer;
    }
}