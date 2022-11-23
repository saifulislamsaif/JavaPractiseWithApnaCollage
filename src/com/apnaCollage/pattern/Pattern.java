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
    public void max(int first,int second){
        if (first>second){
            System.out.println("Big number is "+" "+ first);
        }else if(first==second) {
            System.out.println("Two number are equal");
        }else {
            System.out.println("Big number is "+" "+ second);
        }
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number");
        int firstN = scanner.nextInt();
        System.out.println("Enter First Number");
        int secondN = scanner.nextInt();

        Pattern pattern = new Pattern();
        pattern.max(firstN,secondN);

    }
}

