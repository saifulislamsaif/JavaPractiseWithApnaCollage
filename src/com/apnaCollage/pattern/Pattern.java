package com.apnaCollage.pattern;
/*      Pattern hollow rectangle
 *****
 *   *
 *   *
 *****
 */

public class Pattern {
    public static void main(String[] args) {
        int r, c;
        r = 4;
        c = 5;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if (i == 1 || j == 1 || i == r || j == c) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
