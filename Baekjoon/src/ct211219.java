// 윤년

import java.util.Scanner;

class Solution211219{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int tf = 0;
        if(num % 4 == 0){
            if(num % 100 != 0 || num % 400 ==0) tf = 1;
            else tf = 0;
        }
        System.out.print(tf);
    }
}