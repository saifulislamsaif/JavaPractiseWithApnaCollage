package com.apnaCollage.pattern;
/*       slid rhombus with stars

 ******
 ******
 ******
 ******
 ******

 */

public class Pattern {
    public static void main(String[] args) {
        int n;
        n = 5;

        for (int i=1;i<=n;i++){
            for (int j = 0; j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j = 0;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
