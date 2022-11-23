package com.apnaCollage.pattern;

import java.util.Scanner;

public class Pattern {
    public String eligibleToVote(int a) {
        String s = "This Person Eligible for Vote";
        String n = "This Person is not Eligible for Vote";
        if (a >= 18) {
            return s;
        } else
            return n;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter First Number");
//        int firstN = scanner.nextInt();
//        System.out.println("Enter First Number");
//        int secondN = scanner.nextInt();
        System.out.println("Enter the Age:");
        int age = scanner.nextInt();

        Pattern pattern = new Pattern();
        String result = pattern.eligibleToVote(age);
        System.out.println(result);

    }
}

