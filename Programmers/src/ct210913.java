// 숫자는 싫어

import java.util.*;

class Solution13 {
    public int[] solution(int []arr) {
        int[] list = new int[arr.length];
        int count = 1;
        int num = 1;
        list[0] = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i-1]){
                list[num++] = arr[i];
                count++;
            }
        }
        int[] answer = new int[count];
        for(int i = 0; i < count; i++){
            answer[i] = list[i];
        }
        return answer;
    }
}