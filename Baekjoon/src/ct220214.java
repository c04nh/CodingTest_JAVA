// 택시 기하학

import java.util.Scanner;
 
class Solution220214{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double R = scan.nextDouble();	// 반지름 R
		scan.close();
		System.out.println(R * R * Math.PI);
		System.out.println(2 * R * R);
	}
}