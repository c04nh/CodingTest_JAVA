// 최댓값

import java.util.Scanner;

class Solution220106{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[9];
        for(int i = 0; i < 9; i++){
            arr[i] = scan.nextInt();
        }
        int max = arr[0];
        int index = 1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                index = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}