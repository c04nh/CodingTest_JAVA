// 패션왕 신해빈

import java.util.*;

class Solution220416{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T-- > 0) {
            HashMap<String, Integer> hm = new HashMap<>();
            int N = scan.nextInt();
            while (N-- > 0) {
                scan.next();
                String kind = scan.next();
                if (hm.containsKey(kind)) {
                    hm.put(kind, hm.get(kind) + 1);
                }
                else {
                    hm.put(kind, 1);
                }
            }
            int result = 1;
            for (int val : hm.values()) {
                result *= (val + 1);
            }
            System.out.println(result - 1);
        }
    }
}