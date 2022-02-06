// 소인수분해

import java.util.Scanner;
 
class Solution220207{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		for (int i = 2; i <= Math.sqrt(N); i++) {
			while (N % i == 0) {
				System.out.println(i);
				N /= i;
			}
		}
		if (N != 1) {
			System.out.println(N);
		}
	}
}