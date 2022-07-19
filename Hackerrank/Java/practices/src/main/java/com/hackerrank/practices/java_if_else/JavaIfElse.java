package com.hackerrank.practices.java_if_else;

import java.util.Scanner;

public class JavaIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myInt = scanner.nextInt();
        scanner.close();
        if (myInt % 2 == 1) {
            System.out.println("Weird");
        } else {
            if (myInt >= 2 && myInt <= 5) {
                System.out.println("Not Weird");
            }
            if (myInt >= 6 && myInt <= 20) {
                System.out.println("Weird");
            }
            if (myInt > 20) {
                System.out.println("Not Weird");
            }
        }
    }
}
