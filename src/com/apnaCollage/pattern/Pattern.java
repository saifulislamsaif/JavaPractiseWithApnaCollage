package com.apnaCollage.pattern;
/*      Pattern Rectangle
           *****
           *****
           *****
           *****             */

public class Pattern {
    public static void main(String[] args) {
        int r,c;
        r=4;
        c=5;
        for (int i = 1;i<=r;i++){
            for (int j = 1;j<=c;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
