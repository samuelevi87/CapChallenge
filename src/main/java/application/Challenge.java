package main.java.application;

import main.java.application.Questoes.Anagram;

import java.util.Scanner;

import static main.java.application.Questoes.Passwords.*;
import static main.java.application.Questoes.Stairs.*;

public class Challenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Escada de tamanho n ");
        System.out.println("2 - Senha forte");
        System.out.println("3 - Busca de Anagramas");

        System.out.print("Digite o número da opção desejada: ");

        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                escada();
                break;
            case 2:
                padraoDeSenha();
                break;
            case 3:
                Anagram.anagramas();
                break;
            default:
                throw new IllegalStateException("Escolha uma opção listada acima, a opção: " + opcao + " não existe.");
        }

    }


}


