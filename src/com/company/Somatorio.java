package com.company;

import java.util.Scanner;

public class Somatorio {

    public Somatorio() {
        initialSetUp();
    }

    private static void initialSetUp() {

        Scanner sc = new Scanner(System.in);
        System.out.printf("\nDigite o número que voce deseja descobrir o somatório de todos os valores até ele (1 até N): ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if(i == n) {
                System.out.printf("%d ", i);
                continue;
            }
            System.out.printf("%d + ", i);
        }
        System.out.printf("= %d", somatorio(n));
        System.out.println("\n");
    }

    private static int somatorio(int num) {

        if(num == 1)
            return 1;
        return num + somatorio(num - 1);
    }
}
