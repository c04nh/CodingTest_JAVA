// Fly me to the Alpha Centauri

import java.util.Scanner;
 
class Solution220204{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int i = 0; i < T; i++) {
			int X = scan.nextInt();
			int Y = scan.nextInt();
			int distance = Y - X;			
			int max = (int)Math.sqrt(distance);            
			if(max == Math.sqrt(distance)) {
				System.out.println(max * 2 - 1);
			}else if(distance <= max * max + max) {
				System.out.println(max * 2);
			}else {
				System.out.println(max * 2 + 1);
			}
		}
	}
}