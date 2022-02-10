// 직사각형에서 탈출

import java.util.Scanner;
 
class Solution220211{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int w = scan.nextInt();
		int h = scan.nextInt();
		int x_min = Math.min(x, w - x);
		int y_min = Math.min(y, h - y);
		System.out.println(Math.min(x_min, y_min));
	}
}