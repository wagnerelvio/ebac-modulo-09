package br.com.welc;

import java.util.Scanner;

public class Conversao {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Leitura de um valor numérico (primitivo)
        System.out.print("Digite um número inteiro: ");
        int valorPrimitivo = scanner.nextInt();

        // Conversão para o tipo wrapper Integer
        Integer valorWrapper = Integer.valueOf(valorPrimitivo);

        // Exibição dos resultados
        System.out.println("Valor primitivo: " + valorPrimitivo);
        System.out.println("Valor wrapper: " + valorWrapper);

         scanner.close();
    }
}

