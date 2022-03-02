// 소트인사이드

import java.util.Scanner;
 
class Solution220303{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] counting = new int[10];
		int N = scan.nextInt();
		while (N != 0) {
			counting[N % 10]++;
			N /= 10;
		}
		for(int i = 9; i >= 0; i--) {
			while (counting[i]-- > 0) {
				System.out.print(i);
			}
		} 
	}
}