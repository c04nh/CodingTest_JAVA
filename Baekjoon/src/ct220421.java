// 수열

import java.util.Scanner;

class Solution220421{
    static int[] temp ;
    static int N, K;
    static int Answer = Integer.MIN_VALUE;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        K = scan.nextInt();
        temp = new int [N];
        for (int i = 0; i < N; i++) {
            temp[i] = scan.nextInt();
        }
        for (int i = 0; i <= N - K; i++) {
            int sum =0;
            for (int j = i; j < i + K; j++) {
                sum += temp[j];
            }
            Answer = Math.max(Answer, sum);
        }
        System.out.println(Answer);
    }
}