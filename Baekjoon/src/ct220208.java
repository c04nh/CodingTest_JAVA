// 소수 구하기

import java.util.Scanner;

class Solution220208{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int M = scan.nextInt();
        int N = scan.nextInt();
        boolean arr[] = new boolean[N + 1];
        arr[0] = true;
        arr[1] = true;
        for(int i = 2; i < Math.sqrt(N + 1); i++){
            for(int j = i * i; j < N + 1; j += i){
                arr[j] = true; 
            }
        }
        for(int i = M; i < N + 1; i++){
            if(arr[i] == false) System.out.println(i);
        }
    }
}