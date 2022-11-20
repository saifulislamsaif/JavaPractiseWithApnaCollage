package com.apnaCollage.pattern;
/*       Butterfly pattern with stars

 *      *
 **    **
 ***  ***
 ********
 ********
 ***  ***
 **    **
 *      *

 */

public class Pattern {
    public static void main(String[] args) {
        int n;
        n = 4;
        for (int i = 1; i <= n; i++) {
//            1st half right portion
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //space print
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
//            1st half right portion
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
//            2nd half left portion
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
//            2nd half space portion
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
//            2nd half right portion
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
