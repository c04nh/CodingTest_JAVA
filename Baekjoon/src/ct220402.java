// 동전 0

import java.util.Scanner;

class Solution220402{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
        int[] coin = new int[N];
        for(int i = 0; i < N; i++) {
            coin[i] = scan.nextInt();
        }
        int count = 0;
        for(int i = N - 1; i >= 0; i--) {
            if(coin[i] <= K) {
                count += (K / coin[i]);
                K = K % coin[i];
            }
        }
        System.out.println(count);
    }
}