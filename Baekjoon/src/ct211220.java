// 4분면 고르기

import java.util.Scanner;

class Solution211220{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        if(x > 0){
            if(y > 0) System.out.print(1);
            else System.out.print(4);
        }else{
            if(y > 0) System.out.print(2);
            else System.out.print(3);
        }
    }
}