// 배수와 약수

import java.util.Scanner;

class Solution220407{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();
            if(num1 == 0 && num2 == 0) break;
            if(num2 % num1 == 0) {
                System.out.println("factor");
            }else if(num1 % num2 == 0) {
                System.out.println("multiple");
            }else {
                System.out.println("neither");
            }
        }
    }
}