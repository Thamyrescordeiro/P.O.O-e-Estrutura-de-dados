package exercicios;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor inicial: ");
        int inicial = entrada.nextInt();

        System.out.println("Digite a razao: ");
        int R = entrada.nextInt();

        int A = inicial, valor_max = 10;

        System.out.printf("Valor inicial %d e razão %d%n", inicial, R);

        while (A <= valor_max) {
            System.out.println(A);
            A += R;
        }
    }
    }
