package com.apnaCollage.pattern;
/*       0-1 triangle

1
0 1
1 0 1
0 1 0 1
 */

public class Pattern {
    public static void main(String[] args) {
        int n;
        n = 4;
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }

            }
            System.out.println();
        }
    }
}
