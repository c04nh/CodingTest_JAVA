// 오븐 시계

import java.util.Scanner;

class Solution220215{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int m = scan.nextInt();
        int t = scan.nextInt();
        h += t / 60;
        m += t % 60;
        if(m >= 60){
            h += 1;
            m -= 60;
        }
        if(h >= 24){
            h -= 24;
        }
        System.out.println(h + " " + m);
    }
}