// N과 M (4)

import java.util.Scanner;

class Solution220312{
    public static int N, M;
    public static int[] arr;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        M = scan.nextInt();
        arr = new int[M];
        dfs(1, 0);
    }

    public static void dfs(int at, int depth) {
        if (depth == M) {
            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }
        for (int i = at; i <= N; i++) {
            arr[depth] = i;
            dfs(i, depth + 1);
        }
    }
}