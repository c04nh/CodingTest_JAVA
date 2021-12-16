// 곱셈

import java.util.Scanner;

class Solution211216{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int units = num2 % 10;
        int tens = (num2 / 10) % 10;
        int hundreds = num2 / 100;
        System.out.println(num1 * units);
        System.out.println(num1 * tens);
        System.out.println(num1 * hundreds);
        System.out.println(num1 * num2);
    }
}