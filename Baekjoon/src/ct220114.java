// 한수

import java.util.Scanner;

class Solution220114{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int count = 0;
		for(int i = 1; i <= num; i++) {
			if(i <= 99){
				count++;
			}else{
				String[] arr = Integer.toString(i).split("");
				if((Integer.parseInt(arr[1]) - Integer.parseInt(arr[0])) == (Integer.parseInt(arr[2])- Integer.parseInt(arr[1]))){
					count++;
				}
			}
		}
		System.out.println(count);
	}
}