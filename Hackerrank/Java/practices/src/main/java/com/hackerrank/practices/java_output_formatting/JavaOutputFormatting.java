package com.hackerrank.practices.java_output_formatting;

import java.util.Scanner;

public class JavaOutputFormatting {

    //    The "-" is used to left indent
//    The "15" makes the String's minimum length it takes up be 15
//    The "s" (which is a few characters after %) will be substituted by our String
//    The 0 pads our integer with 0s on the left
//    The 3 makes our integer be a minimum length of 3
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String myString = scanner.next();
            int myInt = scanner.nextInt();
            System.out.format("%-15s%03d%n", myString, myInt);
        }
        System.out.println("================================");
    }
}
