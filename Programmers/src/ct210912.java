// 나누어 떨어지는 숫자 배열

import java.util.Arrays;

class Solution12 {
    public int[] solution(int[] arr, int divisor) {
        int count = 0;
        int num = 0;
        int list[] = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                list[num++] = arr[i];
                count++;
            }
        }
        int answer[];
        if(count > 0){
            answer = new int[count];
            for(int i = 0; i < count; i++){
                answer[i] = list[i];
            }
        }else{
            answer = new int[1];
            answer[0] = -1;
        }
        Arrays.sort(answer);
        return answer;
    }
}