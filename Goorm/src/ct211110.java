// 1단계
// 윤년 (Leap Year)


import java.io.*;
class Solution211110 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int year = Integer.parseInt(input);
		if(year % 4 == 0){
			if(year % 100 == 0){
				if(year % 400 == 0) System.out.print("Leap Year");
				else System.out.print("Not Leap Year");
			}else System.out.print("Leap Year");
		}else System.out.print("Not Leap Year");
	}
}