// 링

import java.util.Scanner;

class Solution220412{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int firstRing = scan.nextInt();
        for (int i = 1; i < N; i++) {
            int otherRing = scan.nextInt();
            int gcd = gcd(firstRing, otherRing);
            System.out.println((firstRing / gcd) + "/" + (otherRing / gcd));
        }
    }

    static int gcd(int a, int b) {
        int r;
        while (b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}