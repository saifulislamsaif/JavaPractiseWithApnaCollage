package com.subString;

import java.io.*;
import java.util.*;


class Result {
    public static String[] findSubstring(String s, int k) {

        char[] array = s.toCharArray();

        int a = 0, b = k, previous_C = 0;
        String previous_W = "";
        String[] array2 = new String[2];
        int c = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'a' || array[i] == 'e' || array[i] == 'i' ||
                    array[i] == 'o' || array[i] == 'u') {
                c++;
                break;
            } else {
                if (c != 0)
                    array2[0] = "Not found!";
            }

        }

        if (c != 0) {
            while (a != (array.length - k + 1)) {

                int count = 0;
                String word = "";

                for (int i = a; i < b; i++) {
                    if (array[i] == 'a' || array[i] == 'e' || array[i] == 'i' ||
                            array[i] == 'o' || array[i] == 'u') {
                        count++;
                    }

                    while (i == 0) {
                        previous_C = count;
                        break;
                    }
                    word += "" + array[i];
                }
                while (a == 0) {
                    previous_W = word.toString();
                    break;
                }
                a++;
                b++;

                if (count > previous_C && previous_C != 0) {
                    previous_C = count;
                    previous_W = word.toString();
                }
                //***
            }
        }
        if (c != 0) {
            array2[0] = previous_W;
        }


        array2[1] = (String.valueOf(previous_C));
        return array2;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        System.gc();
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int k = sc.nextInt();

        String[] result = Result.findSubstring(s, k);
        if (result[0] == null) {
            System.out.printf("Not found!");
        } else {
            System.out.println(result[0]);
        }// System.out.println(result[1]);
        System.gc();
    }
}
