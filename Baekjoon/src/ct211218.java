// 시험 성적

import java.util.Scanner;

class Solution211218{
	
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        char score;
        if(num >= 90) score = 'A';
        else if(num >= 80) score = 'B';
        else if(num >= 70) score = 'C';
        else if(num >= 60) score = 'D';
        else score = 'F';
        System.out.print(score);
    }
}