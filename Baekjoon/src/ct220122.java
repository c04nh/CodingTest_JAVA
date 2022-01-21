// 다이얼

import java.util.Scanner;
 
class Solution220122{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int count = 0;
		String s = scan.nextLine();
		int k = s.length();
		for(int i = 0; i < k; i++) {			
			if(s.charAt(i) < 68) count += 3;
			else if(s.charAt(i) < 71) count += 4;
			else if(s.charAt(i) < 74) count += 5;
			else if(s.charAt(i) < 77) count += 6;
			else if(s.charAt(i) < 80) count += 7;
			else if(s.charAt(i) < 84) count += 8;
			else if(s.charAt(i) < 87) count += 9;
			else count += 10;
		}
		System.out.print(count);
	}
}