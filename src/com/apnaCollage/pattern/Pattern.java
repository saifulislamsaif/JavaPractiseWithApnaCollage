package com.apnaCollage.pattern;
/*        half pyramid with numbers


 1
1 2
1 2 3
1 2 3 4
 */

public class Pattern {
    public static void main(String[] args) {
        int n;
        n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
