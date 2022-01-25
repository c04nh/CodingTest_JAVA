// 벌집

import java.util.Scanner;
 
class Solution220126{
	public static void main(String[] args) {
 
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int count = 1;
		int range = 2;
		if (N == 1) {
			System.out.print(1);
		}else {
			while (range <= N) {
				range = range + (6 * count);
				count++;
			}
			System.out.print(count);
		}
	}
}