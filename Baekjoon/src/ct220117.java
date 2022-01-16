// 알파벳 찾기

import java.util.Scanner;

class Solution220117{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        for(char c = 'a'; c <= 'z'; c++)
            System.out.print(word.indexOf(c) + " ");
    }
}