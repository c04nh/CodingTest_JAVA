// 구구단

import java.util.Scanner;

class Solution211222{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        int num = scan.nextInt();
        for(int i = 1; i <= 9; i++){
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}