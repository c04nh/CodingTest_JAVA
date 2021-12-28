// A+B - 7

import java.util.Scanner;

class Solution211228{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i = 1; i <= num; i++){
            int A = scan.nextInt();
            int B = scan.nextInt();
            System.out.println("Case #" + i + ": " + (A + B));
        }
    }
}