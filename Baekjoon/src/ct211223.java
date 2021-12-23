// A+B - 3

import java.util.Scanner;

class Solution211223{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int cnt = scan.nextInt();
        for(int i = 0; i < cnt; i++){
            int A = scan.nextInt();
            int B = scan.nextInt();
            System.out.println(A + B);
        }
    }
}