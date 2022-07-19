package com.hackerrank.practices.java_for_loop_2;

import java.util.Scanner;

public class JavaForLoop2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            int result = a;
            for (int j = 0; j < n;
                 j++) {
                result += Math.pow(2, j) * b;
                System.out.printf("%s ", result);
            }
            System.out.println("");
        }
        scanner.close();
    }
}
