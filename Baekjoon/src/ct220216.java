// 주사위 세개

import java.util.Scanner;

class Solution220216{
    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int a = scan.nextInt();
	    int b = scan.nextInt();
	    int c = scan.nextInt();
	    if(a == b && a == c && b == c){
		    System.out.print(10000 + (a * 1000));
	    }else if(a == b || a == c){
		    System.out.print(1000 + (a * 100));
	    }else if(b == c){
		    System.out.print(1000 + (b * 100));
	    }else{
		    System.out.print((Math.max(a, Math.max(b, c)) * 100));
	    }
	}
}
