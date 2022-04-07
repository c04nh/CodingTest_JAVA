// 약수

import java.util.Scanner;

class Solution220408{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while(T-- > 0) {
            int N = scan.nextInt();
            max = N > max ? N : max;
            min = N < min ? N : min;
        }
        System.out.println(max * min);
    }
}