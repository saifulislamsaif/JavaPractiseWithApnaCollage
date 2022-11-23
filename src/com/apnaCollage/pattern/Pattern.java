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
int n=5,sum=0;
    public void sum(){
        for (int i = 0;i<=n;i++){
            if (i%2==1){
                sum=sum+i;
            }

        }
        System.out.println(sum);
    }
    public static void main(String args[]) {
//        Scanner scanner = new Scanner(System.in);
//        int firstN = scanner.nextInt();
//        int secondN = scanner.nextInt();
//        int thirdN = scanner.nextInt();

        Pattern pattern = new Pattern();
        pattern.sum();

    }
}

