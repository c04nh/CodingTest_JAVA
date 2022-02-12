// 직각삼각형

import java.util.Scanner;
 
class Solution220213{
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {    	
        	int x = scan.nextInt();
        	int y = scan.nextInt();
        	int z = scan.nextInt();
        	if(x == 0 && y == 0 && z == 0) break;
        	if((x * x + y * y) == z * z) {
				System.out.println("right");
			}else if(x * x == (y * y + z * z)) {
				System.out.println("right");
			}else if(y * y == (z * z + x * x)) {
				System.out.println("right");
			}else {
				System.out.println("wrong");
			}
		}
	}
}