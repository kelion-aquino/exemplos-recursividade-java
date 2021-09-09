package com.company;

import java.util.Scanner;

public class TowerOfHanoi {

    public TowerOfHanoi() {
        initialSetUp();
    }

    private static void initialSetUp() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de discos: ");
        int n = sc.nextInt();
        hanoi(n, 1, 3, 2);
    }

    private static void hanoi(int n, int originPin, int destinationPin, int workPin) {
        if (n > 0) {
            hanoi(n - 1, originPin, workPin, destinationPin);
            move(originPin, destinationPin);
            hanoi(n - 1, workPin, destinationPin, originPin);
        }
    }

    private static void move(int originPin, int destinationPin) {
        System.out.println(originPin + " -> " + destinationPin);
    }
}
