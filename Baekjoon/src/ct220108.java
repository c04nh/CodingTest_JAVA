// 나머지

import java.util.Scanner;
import java.util.Arrays;

class Solution220108{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] arr = {scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt()};
        for(int i = 0; i < 10; i++){
            arr[i] = arr[i] % 42;
        }
        Arrays.sort(arr);
        int cnt = 1;
        for(int i = 1; i < 10; i++){
            if(arr[i] != arr[i - 1]) cnt++;
        }
        System.out.print(cnt);
    }
}