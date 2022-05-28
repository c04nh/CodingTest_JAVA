// 곱셈

import java.util.Scanner;

class Solution220528 {
    public static long C;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long A = scan.nextLong();
        long B = scan.nextLong();
        C = scan.nextLong();
        System.out.println(pow(A, B));
    }

    public static long pow(long A, long exponent) {
        if(exponent == 1) {
            return A % C;
        }
        long temp = pow(A, exponent / 2);
        if(exponent % 2 == 1) {
            return (temp * temp % C) * A % C;
        }
        return temp * temp % C;
    }
}