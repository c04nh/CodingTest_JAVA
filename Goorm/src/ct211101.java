// 1단계
// 시험성적 평균과 등급 구하기

import java.io.*;

class Solution211101 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] arr = input.split(" ");
		int kor = Integer.parseInt(arr[0]);
		int math = Integer.parseInt(arr[1]);
		int eng = Integer.parseInt(arr[2]);
		double avg = (kor + math + eng) / 3.0;
		char grade;
		if(avg >= 90) grade = 'A';
		else if(avg >= 80) grade = 'B';
		else if(avg >= 70) grade = 'C';
		else if(avg >= 60) grade = 'D';
		else grade = 'F';
		System.out.print(String.format("%.2f", avg) + " " + grade);
	}
}