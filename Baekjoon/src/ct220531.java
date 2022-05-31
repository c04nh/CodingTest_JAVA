// 행렬 제곱

import java.util.Scanner;

class Solution220531 {
    final static int MOD = 1000;
    public static int N;
    public static int[][] origin;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        long B = scan.nextLong();
        origin = new int[N][N];
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                origin[i][j] = scan.nextInt() % MOD;
            }
        }
        int[][] result = pow(origin, B);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                sb.append(result[i][j]).append(' ');
            }
            sb.append('\n');
        }
        System.out.println(sb);

    }

    public static int[][] pow(int[][] A, long exp) {
        if(exp == 1L) {
            return A;
        }
        int[][] ret = pow(A, exp / 2);
        ret = multiply(ret, ret);
        if(exp % 2 == 1L) {
            ret = multiply(ret, origin);
        }
        return ret;
    }

    public static int[][] multiply(int[][] o1, int[][] o2) {
        int[][] ret = new int[N][N];
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                for(int k = 0; k < N; k++) {
                    ret[i][j] += o1[i][k] * o2[k][j];
                    ret[i][j] %= MOD;
                }
            }
        }
        return ret;
    }
}