package application;

import Questoes.Stairs;

import java.util.InputMismatchException;
import java.util.Scanner;

import static Questoes.Passwords.padraoDeSenha;

public class Challenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Escada de tamanho n ");
        System.out.println("2 - Senha forte");

        System.out.print("Digite o número da opção desejada: ");

        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                Stairs.escada();
                break;
            case 2:
                padraoDeSenha();
                break;
            case 4:
                break;
        }

    }


}


