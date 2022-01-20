// 상수

import java.util.Scanner;

class Solution220121{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        scan.close();
        int result1 = 0;
        int result2 = 0;
        while(num1 != 0){
            result1 = result1 * 10 + num1 % 10;
            num1 /= 10;
        }
        while(num2 != 0){
            result2 = result2 * 10 + num2 % 10;
            num2 /= 10;
        }
        if(result1 > result2) System.out.print(result1);
        else System.out.print(result2);
    }
}