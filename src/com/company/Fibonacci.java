package com.company;

import java.util.Scanner;

public class Fibonacci {

    public Fibonacci() {
        initialSetUp();
    }

    private static void initialSetUp() {

        Scanner sc = new Scanner(System.in);
        System.out.printf("\nDigite o range da sequencia de Fibonacci que voce deseja visualizar: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf(fibo(i) + " ");
        }
        System.out.println("\n");
    }

    private static long fibo(int n) {
        if (n < 2) {
            return 1;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
}
