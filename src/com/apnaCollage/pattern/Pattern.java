package com.apnaCollage.pattern;
/*       Print Inverted Half Pyramid

1111
222
33
4

 */

import java.time.Period;
import java.util.Scanner;

public class Pattern {
   Double pi =3.1416;
    public void max(int r){
        Double radius = 2*pi*r;
        System.out.println("Circumference is"+" "+radius);
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter First Number");
//        int firstN = scanner.nextInt();
//        System.out.println("Enter First Number");
//        int secondN = scanner.nextInt();
        System.out.println("Enter the Radius:");
        int radius = scanner.nextInt();

        Pattern pattern = new Pattern();
        pattern.max(radius);

    }
}

