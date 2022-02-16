package Questoes;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Passwords {

    public static void padraoDeSenha() {
        Scanner sc = new Scanner(System.in);

        Pattern padraoDeSenha = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[!@#$%^&*()-+]).{6,}$");

        boolean senhaFraca = true;

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        if (nome.isBlank() || nome.isEmpty()) {
            throw new IllegalArgumentException("O campo nome não pode ser vazio!");
        }
        while (senhaFraca) {
            System.out.print("Olá " + nome + ", digite uma senha: ");
            String senhaDigitada = sc.nextLine();
            Matcher aSenhaSegueOPadrão = padraoDeSenha.matcher(senhaDigitada);

            if (!aSenhaSegueOPadrão.matches()) {
                if (senhaDigitada.length() < 6) {
                    int caracteresfaltando = 6 - senhaDigitada.length();
                    System.out.println("Sua senha não tem o tamanho mínimo de caracteres, faltam " + caracteresfaltando + " caracteres para o mínimo necessário.");
                } else {
                    System.out.println("Lembre-se que para sua senha ser aceita ela deve ter:");
                    System.out.println("No mínimo 1 dos seguintes caracteres especiais: ! @ # $ % ^ & * ( ) - + ");
                    System.out.println("No mínimo 1 letra minúscula. ");
                    System.out.println("No mínimo 1 letra maiúscula. ");
                    System.out.println("No mínimo 1 número. ");
                }
                senhaFraca = true;
            } else {
                System.out.println("Senha Forte Cadastrada.");
                senhaFraca = false;
            }
        }
        sc.close();
    }
}

