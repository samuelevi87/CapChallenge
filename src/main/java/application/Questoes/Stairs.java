package main.java.application.Questoes;

import java.util.Scanner;

public class Stairs {

    public static void escada() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a altura da escada: ");
        int alturaDaEscada = sc.nextInt();

        criarEscada(alturaDaEscada);
        sc.close();
    }

    public static void criarEscada(int alturaDaEscada) {
        for (int i = 1; i <= alturaDaEscada; i++) {
            for (int k = 1; k <= alturaDaEscada - i + 1; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
