// 최소, 최대

import java.util.Scanner;

class Solution220105{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] arr = new int[num];
        for(int i = 0; i < num; i++){
            arr[i] = scan.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }else if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.print(min + " " + max);
    }
}