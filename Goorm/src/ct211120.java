// 1단계
// 거스름돈

import java.io.*;
class Solution211120 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int price = 1000 - Integer.parseInt(input);
		int[] coin = {0, 0, 0, 0};
		while(price > 0){
			if(price >= 500){
				price -= 500;
				coin[0]++;
			}else if(price >= 100){
				price -= 100;
				coin[1]++;
			}else if(price >= 50){
				price -= 50;
				coin[2]++;
			}else{
				price -= 10;
				coin[3]++;
			}
		}
		for(int i = 0; i < 4; i++) System.out.print(coin[i] + " ");
	}
}