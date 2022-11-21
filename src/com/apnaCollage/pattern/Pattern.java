package com.apnaCollage.pattern;
/*       Print Pascal’s Triangle.

  1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1

 */

public class Pattern {
    public static void main(String args[]) {
        int n=4, number = 1;
        int space = n;
        for (int i = 0; i <= n; i++) {
            for (int s =1;s<=space;s++){
                System.out.print(" ");
            }
            number=1;
            for (int j = 0;j<=i;j++){
                System.out.print(number+" ");
                number = number*(i-j)/(j+1);
            }
            space--;
            System.out.println();
        }

    }
}

