// 숫자의 개수

import java.util.Scanner;

class Solution220107{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String result = String.valueOf(scan.nextInt() * scan.nextInt() * scan.nextInt());
        int[] cnt = new int[10];
        for(int i = 0; i < result.length(); i++){
            cnt[Character.getNumericValue(result.charAt(i))]++;
        }
        for(int i = 0; i < cnt.length; i++){
            System.out.println(cnt[i]);
        }
    }
}