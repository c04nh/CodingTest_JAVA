// 네 번째 점

import java.util.Scanner;

class Solution220212{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[3][2];
        for(int i = 0; i < 3; i++){
            arr[i][0] = scan.nextInt();
            arr[i][1] = scan.nextInt();
        }
        int x = arr[0][0];
        int y = arr[0][1];
        for(int i = 1; i < 3; i++){
            if(arr[i][0] != x){
                x += arr[i][0];
                break;
            } 
        }
        for(int i = 1; i < 3; i++){
            if(arr[i][1] != y){
                y += arr[i][1];
                break;
            } 
        }
        x *= 2;
        y *= 2;
        x -= arr[0][0] + arr[1][0] + arr[2][0];
        y -= arr[0][1] + arr[1][1] + arr[2][1];
        System.out.print(x + " " + y);
    }
}