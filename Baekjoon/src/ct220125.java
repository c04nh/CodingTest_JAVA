// 손익분기점

import java.util.Scanner;
 
class Solution220125{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();	
		int B = scan.nextInt();
		int C = scan.nextInt(); 
		if (C <= B) {
			System.out.println("-1");
		} 
		else {
			System.out.println((A / (C - B)) + 1);
		}
	}
}