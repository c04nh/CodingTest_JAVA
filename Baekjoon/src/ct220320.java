// 파도반 수열

import java.util.Scanner;

class Solution220320{
    public static Long[] seq = new Long[101];
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        seq[0] = 0L;
        seq[1] = 1L;
        seq[2] = 1L;
        seq[3] = 1L;
        int T = scan.nextInt();
        while(T-- > 0) {
            int N = scan.nextInt();
            System.out.println(padovan(N));
        }
    }

    public static long padovan(int N) {
        if(seq[N] == null) {
            seq[N] = padovan(N - 2) + padovan(N - 3);
        }
        return seq[N];
    }
}