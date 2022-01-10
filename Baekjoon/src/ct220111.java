// 평균은 넘겠지

import java.util.Scanner;
 
class Solution220111 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr;
		int num = scan.nextInt();
		for(int i = 0 ; i < num ; i++) {
			int n = scan.nextInt(); 
			arr = new int[n];
			double sum = 0;
			for(int j = 0 ; j < n ; j++) {
				int score = scan.nextInt();
				arr[j] = score;
				sum += score;
			}
			double avg = (sum / n) ;
			double count = 0;
			for(int j = 0 ; j < n ; j++) {
				if(arr[j] > avg) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n",(count / n) * 100);
		}
		scan.close();
	}
	
}