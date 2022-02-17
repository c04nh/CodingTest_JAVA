// 팩토리얼

import java.util.Scanner;
 
class Solution220218{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.close();
		int sum = factorial(N);
		System.out.println(sum);
	}
	public static int factorial(int N) {
		if(N <= 1) return 1;
		return N * factorial(N - 1);		
	}
}