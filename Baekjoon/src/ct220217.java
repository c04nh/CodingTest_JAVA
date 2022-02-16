// 터렛

import java.io.*; 
import java.util.StringTokenizer; 

class Solution220217{ 
    public static void main(String[] args) throws IOException{ 
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
        StringTokenizer st = new StringTokenizer(bf.readLine()); 
        int T = Integer.parseInt(st.nextToken()); 
        for(int t = 0;t<T;t++){ 
            double x1, y1, r1, x2, y2, r2, d; 
            st = new StringTokenizer(bf.readLine()); 
            x1 = Double.parseDouble(st.nextToken()); 
            y1 = Double.parseDouble(st.nextToken()); 
            r1 = Double.parseDouble(st.nextToken()); 
            x2 = Double.parseDouble(st.nextToken()); 
            y2 = Double.parseDouble(st.nextToken()); 
            r2 = Double.parseDouble(st.nextToken()); 
            double x = x2 - x1; 
            double y = y2 - y1; 
            d = Math.sqrt(x * x + y * y); 
            if(d == 0 && r1 == r2) System.out.println(-1); 
            else if(d == Math.abs(r1 - r2) || r1 + r2 == d) System.out.println(1); 
            else if(Math.abs(r1 - r2) < d && d <r1 + r2) System.out.println(2); 
            else System.out.println(0); 
        } 
    } 
}