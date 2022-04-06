// 주유소

import java.util.Scanner;

class Solution220406{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        long[] dist = new long[N - 1];
        long[] cost = new long[N];
        for(int i = 0; i < N - 1; i++) {
            dist[i] = scan.nextLong();
        }
        for(int i = 0; i < N; i++) {
            cost[i] = scan.nextLong();
        }
        long sum = 0;
        long minCost = cost[0];
        for(int i = 0; i < N - 1; i++) {
            if(cost[i] < minCost) {
                minCost = cost[i];
            }
            sum += (minCost * dist[i]);
        }
        System.out.println(sum);

    }
}