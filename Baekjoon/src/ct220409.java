// 최대공약수와 최소공배수

import java.util.Scanner;

class Solution220409{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int d = gcd(a, b);
        System.out.println(d);
        System.out.println(a * b / d);
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}