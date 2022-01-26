// 분수찾기

import java.util.Scanner;
 
class Solution220127{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt();
		int cnt = 1;
        int sum = 0;
		while (true) {
			if (X <= sum + cnt) {	
				if (cnt % 2 == 1) {
					System.out.print((cnt - (X - sum - 1)) + "/" + (X - sum));
					break;
				}else {
					System.out.print((X - sum) + "/" + (cnt - (X - sum - 1)));
					break;
				} 
			}else {
				sum += cnt;
				cnt++;
			}
		}
	}
}