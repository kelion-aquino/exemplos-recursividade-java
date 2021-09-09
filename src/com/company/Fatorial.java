package com.company;

import java.util.Scanner;

public class Fatorial {

    public Fatorial() {
        initialSetUp();
    }

    private static void initialSetUp() {

        Scanner sc = new Scanner(System.in);
        System.out.printf("\nDigite o número que voce deseja descobrir o Fatorial: ");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            if(i == 1) {
                System.out.printf("%d ", i);
                continue;
            }
            System.out.printf("%d * ", i);
        }
        System.out.printf("= %d", fatorial(n));
        System.out.println("\n");
    }

    private static int fatorial(int n) {
        return n == 0 ? 1 : n * fatorial(n - 1);
    }
}
