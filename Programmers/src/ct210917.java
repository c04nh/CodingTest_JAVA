// K번째수

import java.util.Arrays;

class Solution17 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int num1, num2 = 0;
        int i, j, k;
        for(int a = 0; a < commands.length; a++){
            num1 = 0;
            i = commands[a][0] - 1;
            j = commands[a][1] - 1;
            k = commands[a][2] - 1;
            int[] arr = new int[j - i + 1];
            for(int b = i; b <= j; b++){
                arr[num1++] = array[b];
            }
            Arrays.sort(arr);
            answer[num2++] = arr[k];
        }
        return answer;
    }
}
