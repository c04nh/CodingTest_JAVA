// 평균

import java.util.Scanner;

class Solution220109{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        double arr[] = new double[num];
        double max = 0;
        double sum = 0;
        for(int i = 0; i < num; i++){
            arr[i] = scan.nextDouble();
            if(max < arr[i]) max = arr[i];
        }
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] / max * 100;
            sum += arr[i];
        }
        System.out.print(sum / arr.length);
    }
}