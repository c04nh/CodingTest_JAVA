// 1로 만들기

import java.util.Scanner;

class Solution220324{
    static Integer[] dp;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        dp = new Integer[N + 1];
        dp[0] = dp[1] = 0;
        System.out.print(recur(N));
    }

    static int recur(int N) {
        if (dp[N] == null) {
            if (N % 6 == 0) {
                dp[N] = Math.min(recur(N - 1), Math.min(recur(N / 3), recur(N / 2))) + 1;
            }else if (N % 3 == 0) {
                dp[N] = Math.min(recur(N / 3), recur(N - 1)) + 1;
            }else if (N % 2 == 0) {
                dp[N] = Math.min(recur(N / 2), recur(N - 1)) + 1;
            }else {
                dp[N] = recur(N - 1) + 1;
            }
        }
        return dp[N];
    }
}