// 파트 04. 시뮬레이션(Simulation)_Java
// Step 1. 숫자 게임

import java.util.*;

class Solution {
    public static final int INF = -1;
    public int solution(int[] A, int[] B) {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        int i_b = A.length - 1;
        for(int i_a = A.length - 1; i_a >= 0; i_a--){
            if (B[i_b] > A[i_a]){
                answer++;
                i_b--;
            }
        }

        return answer;
    }
}