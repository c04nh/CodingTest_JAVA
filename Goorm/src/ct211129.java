// 1단계
// 파손된 램

import java.io.*;
import java.util.*;

class Solution211129 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String input2 = br.readLine();
		String[] arr = input2.split(" ");
		ArrayList<Integer> error = new ArrayList();
		for(int i = 0; i < arr.length; i++){
			int ram = Integer.parseInt(arr[i]);
			if((ram & (ram - 1)) != 0) error.add(i + 1);
		}
		if(error.size() > 0){
			System.out.println(error.size());
			for(int i = 0; i < error.size(); i++) System.out.print(error.get(i) + " ");
		}else System.out.print(0);
	}
}