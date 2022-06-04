// 랜선 자르기

import java.util.Scanner;

class Solution220604 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int K = scan.nextInt();
        int N = scan.nextInt();
        int[] arr = new int[K];
        long max = 0;
        for (int i = 0; i < K; i++) {
            arr[i] = scan.nextInt();
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        max++;
        long min = 0;
        long mid = 0;
        while (min < max) {
            mid = (max + min) / 2;
            long count = 0;
            for (int i = 0; i < arr.length; i++) {
                count += (arr[i] / mid);
            }
            if(count < N) {
                max = mid;
            }else {
                min = mid + 1;
            }
        }
        System.out.println(min - 1);
    }
}