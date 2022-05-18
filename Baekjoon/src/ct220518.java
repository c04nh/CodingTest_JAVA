// 문자열 집합

import java.io.*;
import java.util.*;

class Solution220518 {
    static HashMap<String, Integer> map;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int num= 0;
        map = new HashMap();
        for( int i = 0 ; i < a ; i++ ) {
            map.put(scan.next(), 1);
        }
        for( int i = 0 ; i < b ; i++ ) {
            String str = scan.next();
            if( map.get(str) != null) num++;
        }
        System.out.println(num);
    }
}