// 소수

import java.util.Scanner;

class Solution220206{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int M = scan.nextInt();
        int N = scan.nextInt();
        int sum = 0;
        int min = N;
        for(int i = M; i <= N; i++){
            int result = 0;
            if(i == 1) result++;
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    result++;
                    break;
                }
            }
            if(result == 0){
                sum += i;
                if(min > i) min = i;
            }
        }
        if(sum == 0) System.out.println(-1);
        else{
            System.out.println(sum);
            System.out.println(min);
        }
    }
}