// 1단계
// 뱀이 지나간 자리

import java.io.*;
class Solution211121 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] arr = input.split(" ");
		int num1 = Integer.parseInt(arr[0]);
		int num2 = Integer.parseInt(arr[1]);
		String[][] road = new String[num1][num2];
		for(int i = 0; i < num1; i++){
			for(int j = 0; j < num2; j++){
				if(i % 2 == 0) road[i][j] = "#";
				else{
					if(i / 2 % 2 == 0){
						if(j == num2 - 1) road[i][j] = "#";
						else road[i][j] = ".";
					}else{
						if(j == 0) road[i][j] = "#";
						else road[i][j] = ".";
					}
				}
				System.out.print(road[i][j]);
			}
			System.out.println();
		}
	}
}