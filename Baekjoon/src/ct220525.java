// 대칭 차집합

import java.util.*;

class Solution220525 {
    static Scanner scan = new Scanner(System.in);
    static TreeSet set = new TreeSet();
    public static void main(String[] args) {
        int numOfA = scan.nextInt();
        int numOfB = scan.nextInt();

        insertElements(numOfA);
        insertElements(numOfB);

        System.out.print(set.size());
    }

    static void insertElements(int size) {
        for (int i = 0; i < size; i++) {
            int element = scan.nextInt();
            if (!set.add(element)) set.remove(element);
        }
    }
}