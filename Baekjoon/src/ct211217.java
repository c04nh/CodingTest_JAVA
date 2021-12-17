// 두 수 비교하기

import java.util.Scanner;

class Solution211217{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        if(num1 > num2) System.out.print(">");
        else if(num1 < num2) System.out.print("<");
        else System.out.print("==");
    }
}