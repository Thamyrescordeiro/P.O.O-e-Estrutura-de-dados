package exercicios;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor inicial: ");
        int inicial = entrada.nextInt();

        System.out.println("Digite a razão: ");
        int R= entrada.nextInt();

        int A = inicial, valor_max = 10;

        System.out.printf(" valor inicial %d e razão %d%n", A, R );
        while(A<=valor_max){
            System.out.println(A);
            A *= R;
        }
    }
}
