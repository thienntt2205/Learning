package com.hackerrank.practices.java_for_loop_1;

import java.util.Scanner;

public class JavaForLoop1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myInt = scanner.nextInt();
        for (int count = 1; count <= 10; count++) {
            System.out.println(myInt + " x " + count + " = " + myInt * count);
        }
    }
}
