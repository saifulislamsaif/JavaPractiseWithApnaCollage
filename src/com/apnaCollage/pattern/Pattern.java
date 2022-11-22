package com.apnaCollage.pattern;
/*       Print half Pyramid..

     1
    1 2
   1 2 3
  1 2 3 4
 1 2 3 4 5

 */

public class Pattern {
    public static void main(String args[]) {
        int n=5;
        int space = n;
        for (int i = 1; i <= n; i++) {
            for (int s =1;s<=space;s++){
                System.out.print(" ");
            }

            for (int j = 1;j<=i;j++){
                System.out.print(j+" ");
            }
            space--;
            System.out.println();
        }

    }
}

