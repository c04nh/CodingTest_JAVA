// ATM

import java.util.Scanner;
import java.util.Arrays;

class Solution220404{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        int prev = 0;
        int sum = 0;
        for(int i = 0; i < N; i++){
            sum += prev + arr[i];
            prev += arr[i];
        }
        System.out.println(sum);
    }
}