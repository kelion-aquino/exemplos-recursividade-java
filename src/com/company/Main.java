package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input;
        boolean out = true;

        do {
            System.out.println("--- Recursividade ---");
            System.out.println("[1] - Torre de Hanoi");
            System.out.println("[2] - Fibonacci");
            System.out.println("[3] - Somatório");
            System.out.println("[4] - Fatorial");
            System.out.println("[5] - Sair");
            System.out.println("----------------------");
            System.out.printf("Escolha uma das opções: ");
            input = sc.nextInt();

            switch (input) {
                case 1:
                    TowerOfHanoi towerOfHanoi = new TowerOfHanoi();
                    break;
                case 2:
                    Fibonacci fibonacci = new Fibonacci();
                    break;
                case 3:
                    Somatorio somatorio = new Somatorio();
                    break;
                case 4:
                    Fatorial fatorial = new Fatorial();
                    break;
                case 5:
                    out = false;
                    break;
                default:
                    System.out.println("==> Digite um valor valido!");
                    break;
            }
        }while (out);

        sc.close();
    }
}
