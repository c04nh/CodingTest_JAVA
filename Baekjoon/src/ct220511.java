// 앵그리 창영

import java.util.Scanner;

class Solution220511 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int W = scan.nextInt();
		int H = scan.nextInt();
		for(int i=0; i<N; i++) {
			int len = scan.nextInt();
			if((W*W) + (H*H) >= (len*len)) System.out.println("DA");
			else System.out.println("NE");
		}
		scan.close();
	}
}