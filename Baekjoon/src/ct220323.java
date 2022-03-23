// 계단 오르기

import java.util.Scanner;

class Solution220323{
    static Integer dp[];
    static int arr[];
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        dp = new Integer[N + 1];
        arr = new int[N + 1];
        for(int i = 1; i <= N; i++) {
            arr[i] = scan.nextInt();
        }
        dp[0] = arr[0];
        dp[1] = arr[1];
        if(N >= 2) {
            dp[2] = arr[1] + arr[2];
        }
        System.out.println(find(N));
    }

    static int find(int N) {
        if(dp[N] == null) {
            dp[N] = Math.max(find(N - 2), find(N - 3) + arr[N - 1]) + arr[N];
        }
        return dp[N];
    }
}