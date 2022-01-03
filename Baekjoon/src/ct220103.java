// A+B - 4

import java.util.Scanner;

class Solution220103{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()){
            int A = scan.nextInt();
            int B = scan.nextInt();
            System.out.println(A + B);
        }
    }
}