// 숫자의 합

import java.util.Scanner;

class Solution220116{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String n = scan.next();
        int sum = 0;
        for(int i = 0; i < n.length(); i++){
            sum += Character.getNumericValue(n.charAt(i));
        }
        System.out.print(sum);
    }
}