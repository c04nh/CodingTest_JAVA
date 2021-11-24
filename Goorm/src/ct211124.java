// 1단계
// 의좋은 형제

import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] arr = input.split(" ");
		String input2 = br.readLine();
		int jinwoo = Integer.parseInt(arr[0]);
		int sunwoo = Integer.parseInt(arr[1]);
		int temp = 0;
		for(int i = 1; i <= Integer.parseInt(input2); i++){
			if(i % 2 == 1){
				temp = jinwoo / 2;
				if(temp * 2 != jinwoo) temp++;
				jinwoo -= temp;
				sunwoo += temp;
			}else{
				temp = sunwoo / 2;
				if(temp * 2 != sunwoo) temp++;
				sunwoo -= temp;
				jinwoo += temp;
			}
			
		}
		System.out.print(jinwoo + " " + sunwoo);
	}
}