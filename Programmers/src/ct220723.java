// 파트 03. 이분탐색(Binary Search)_Java
// Step 1. 예산

import java.util.stream.*;

class Solution220723 {
    public int solution(int[] budgets, int M) {
        int min = 0;
        int max = IntStream.of(budgets).max().orElse(0);

        int answer = 0;
        while(min <= max){
            final int mid = (min + max) / 2;

            int sum = IntStream.of(budgets)
                    .map(b -> Math.min(b, mid))
                    .sum();

            if(sum <= M){
                min = mid + 1;
                answer = mid;
            }else{
                max = mid - 1;
            }
        }

        return answer;
    }
}