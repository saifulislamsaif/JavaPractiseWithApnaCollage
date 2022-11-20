package com.apnaCollage.pattern;
/*       Floyd's triangle with numbers

1
2 3
4 5 6
7 8 9 10
 */

public class Pattern {
    public static void main(String[] args) {
        int n,number = 1;
        n = 4;
        for (int i = 0; i <=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}
