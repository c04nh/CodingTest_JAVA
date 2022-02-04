// 소수 찾기

import java.util.Scanner;

class Solution220205{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int count = 0;
		for(int i = 0; i < N; i++) {
			boolean check = true;
			int num = scan.nextInt();
			if(num == 1) {
				continue;
			}
			for(int j = 2; j <= Math.sqrt(num); j++) {
				if(num % j == 0) {
					check = false;
					break;
				}
			}
			if(check) {
				count++;
			}
		}
		System.out.println(count);
	}
}