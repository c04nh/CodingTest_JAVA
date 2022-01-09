// OX퀴즈

import java.util.Scanner;

class Solution220110{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String[] arr = new String[num];
        for(int i = 0; i < num; i++){
            arr[i] = scan.next();
        }
        scan.close();
        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            int score = 0;
            for(int j = 0; j < arr[i].length(); j++){
                if(arr[i].charAt(j) == 'O'){
                    score++;
                    sum += score;
                }else{
                    score = 0;
                }
            }
            System.out.println(sum);
        }
    }
}
