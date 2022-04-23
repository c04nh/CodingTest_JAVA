// 제로

import java.util.Stack;
import java.util.Scanner;

class Solution220423 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        int K = scan.nextInt();
        for(int i = 0; i < K; i++) {
            int number = scan.nextInt();
            if(number == 0) {
                stack.pop();
            }else {
                stack.push(number);
            }
        }
        int sum = 0;
        for(int o : stack) {
            sum += o;
        }
        System.out.println(sum);
    }

}