package com.apnaCollage.pattern;

import java.util.Scanner;

public class Pattern {
    public void eligibleToVote(int a) {
        int zero=0;
        int positive=0;
        int negative=0;
     for (int i = 0;i<=a;i++){
         if (i >= 1 ){
             positive++;
         }else if ( i < 1){
             negative++;
         }else {
             zero++;
         }
     }
        System.out.println("Number of positive is"+" "+positive +" "+"Number of negative is"+" "+negative +" "+"Number of positive is"+" "+zero +" ");
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter First Number");
//        int firstN = scanner.nextInt();
//        System.out.println("Enter First Number");
//        int secondN = scanner.nextInt();
        System.out.println("Enter the Number:");
        int number = scanner.nextInt();

        Pattern pattern = new Pattern();
        pattern.eligibleToVote(number);

    }
}

