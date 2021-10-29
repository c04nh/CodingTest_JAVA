// 1단계
// 제일 작은 수 제거하기

class Solution210926 {
    public int[] solution(int[] arr) {
        int count = 0;
        int[] answer = {};
        if(arr.length == 1){
            answer = new int[1];
            answer[0] = -1;
        }else{
            answer = new int[arr.length - 1];
            int min = arr[0];
            for(int i = 1; i < arr.length; i++){
                if(min > arr[i]){
                    min = arr[i];
                }
            }
            for(int i = 0; i < arr.length; i++){
                if(arr[i] == min){
                    continue;
                }
                answer[count++] = arr[i];
            }
        }
        
        return answer;
    }
}