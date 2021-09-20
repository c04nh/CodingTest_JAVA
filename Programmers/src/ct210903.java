// 1단계
// 평균 구하기

class Solution210903 {
    public double solution(int[] arr) {
        double sum_num = 0;
        for(int i = 0; i < arr.length; i++){
            sum_num += arr[i];
        }
        double answer = sum_num / arr.length;
        return answer;
    }
}