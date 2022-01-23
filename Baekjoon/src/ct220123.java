// 크로아티아 알파벳

import java.util.Scanner;
 
class Solution220123{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int len = str.length();
		int count = 0;
		for (int i = 0; i < len; i++) {
			char ch = str.charAt(i);
			if(ch == 'c' && i < len - 1) {
				if(str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-') {		
					i++;		
				}
            }
			else if(ch == 'd' && i < len - 1) {
				if(str.charAt(i + 1) == '-') {
						i++;
					}
				else if(str.charAt(i + 1) == 'z' && i < len - 2) {
					if(str.charAt(i + 2) == '=') {
						i += 2;
					}
				}
			}
			else if((ch == 'l' || ch == 'n') && i < len - 1) {
				if(str.charAt(i + 1) == 'j') {	// lj 또는 nj 일 경우
					i++;
				}
			}
			else if((ch == 's' || ch == 'z') && i < len - 1) {
				if(str.charAt(i + 1) == '=') {
					i++;
				}
            }
			count++;
		}
		System.out.println(count);
	}
}