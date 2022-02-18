package main.java.application.Questoes;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Anagram {

    public static void anagramas() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a palavra de origem: ");
        String palavraDigitada = sc.nextLine();
        buscaAnagrama(palavraDigitada);

    }

    public static List<String> buscaAnagrama(@NotNull String palavraDigitada) {
        List<String>listaDeSubstrings = new ArrayList<>();

        for (int i = 0; i <= palavraDigitada.length(); i++) {
            for (int y = 0; y <= palavraDigitada.length(); y++) {
                if (y > i) {
                    char[] subString = palavraDigitada.substring(i, y).toCharArray();
                    Arrays.sort(subString);
                    listaDeSubstrings.add(Arrays.toString(subString));
                }
            }
        }
        List<String> resultadoList = new ArrayList<>();
        for (int i = 0; i < listaDeSubstrings.size(); i++) {
            for (int y = 0; y < listaDeSubstrings.size(); y++) {
                if (y != i) {
                    if (listaDeSubstrings.get(i).equals(listaDeSubstrings.get(y))) {
                        int finalI = i;
                        if (resultadoList.stream().noneMatch(
                                subStringEncontrada -> subStringEncontrada.equals(listaDeSubstrings.get(finalI)))) {
                            resultadoList.add(listaDeSubstrings.get(finalI));
                        }
                    }
                }
            }
        }
        System.out.println("Número de anagramas: " + resultadoList.size());
        System.out.print("Anagramas: ");
        resultadoList.forEach(System.out::print);
        return resultadoList;
    }
}

