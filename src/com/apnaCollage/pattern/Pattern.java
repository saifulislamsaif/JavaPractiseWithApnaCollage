package com.apnaCollage.pattern;
/*       inverted half pyramid

 *****
 ****
 ***
 **
 *

 */

public class Pattern {
    public static void main(String[] args) {
        int r, c;
        r = 5;
        c = 5;
        for (int i = r; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
